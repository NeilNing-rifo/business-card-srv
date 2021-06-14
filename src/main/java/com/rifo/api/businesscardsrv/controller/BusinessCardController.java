package com.rifo.api.businesscardsrv.controller;

import com.rifo.api.businesscardsrv.entity.ResPartner;
import com.rifo.api.businesscardsrv.microservice.BusinessCard;
import com.rifo.api.businesscardsrv.microservice.BusinessCardBuilder;
import com.rifo.api.businesscardsrv.microservice.CimsService;
import com.rifo.api.businesscardsrv.microservice.ResPartnerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.omg.CORBA.BAD_PARAM;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

@RestController
@Slf4j
@RequestMapping("/businessCard")
public class BusinessCardController {

    private CimsService cimsService;
    private ResPartnerService resPartnerService;

    public BusinessCardController(CimsService cimsService, ResPartnerService resPartnerService) {
        this.cimsService = cimsService;
        this.resPartnerService = resPartnerService;
    }

    @GetMapping
    public ResponseEntity businessCard(@RequestParam Integer partnerId) throws IOException {

        ResPartner resPartner = resPartnerService.getResPartnerWithCompany(partnerId);

        if (resPartner == null) {
            return ResponseEntity.status(NOT_FOUND).build();
        }

        // prepare title, name, contact details and so on
        BusinessCardBuilder builder = BusinessCardBuilder.newInstance()
                .name(resPartner.getName())
                .email(resPartner.getEmail()).firstName(resPartner.getxFirstName())
                .lastName(resPartner.getxLastName()).mobile(resPartner.getMobile());

        // prepare background
        String busBackgroundUrl = resPartner.getCompany().getxAgentCardBg();
        if(StringUtils.isBlank(busBackgroundUrl)){
            return ResponseEntity.status(HttpStatus.FAILED_DEPENDENCY)
                    .body("background does not exist");
        }

        builder.backGroundUrl(busBackgroundUrl);

        //prepare profile image
        String profileUrl = resPartner.getImages().stream()
                .filter(img -> img.getString("name").equals("image_medium"))
                .findFirst().get().getString("ossurl");
        builder.profileUrl(profileUrl);

        // prepare QR code
        // get wechat qr code or generate a contact details one
        getQrCode(resPartner, builder);

        BusinessCard businessCard = builder.build();

        businessCard.generateBusinessCard();

        BufferedImage card = businessCard.getCard();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        ImageIO.write(card, "png", baos);
        byte[] bytes = baos.toByteArray();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

        return new ResponseEntity(bytes, headers, OK);
    }

    private void getQrCode(ResPartner resPartner, BusinessCardBuilder builder) throws IOException {
        byte[] signatureByte = resPartnerService.getResPartnerPicture(resPartner.getId());

        if (signatureByte != null) {
            ByteArrayInputStream bais = new ByteArrayInputStream(signatureByte);
            // load qr code
            BufferedImage qrImg = ImageIO.read(bais);
            builder.qrCode(qrImg);
        } else {
            String qrCodeTemplate = "BEGIN:VCARD\n" +
                    "VERSION:3.0\n" +
                    "FN:" + resPartner.getName() + "\n" +
                    "TEL;TYPE=cell:" + resPartner.getMobile() + "\n" +
                    "EMAIL;TYPE=internet,work:" + resPartner.getEmail() + "\n" +
                    "ORG:RIFO\n" +
                    "END:VCARD";

            byte[] qrCodeByte = cimsService.generateOrCode(qrCodeTemplate, 200, 200);
            ByteArrayInputStream bais = new ByteArrayInputStream(qrCodeByte);
            // load or code
            BufferedImage qrImg = ImageIO.read(bais);
            builder.qrCode(qrImg);
        }
    }

    @PostMapping("/qrCode")
    public ResponseEntity qrCode(@RequestBody String txt, int width, int height) {

        byte[] qrCode = cimsService.generateOrCode(txt, width, height);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

        return new ResponseEntity(qrCode, headers, HttpStatus.CREATED);
    }

    @GetMapping("/resPartners/{id}")
    public ResponseEntity qrCode(@PathVariable("id") Integer id) {

        ResPartner resPartner = resPartnerService.getResPartnerWithCompany(id);

        return resPartner == null ? ResponseEntity.status(NOT_FOUND).build()
                : ResponseEntity.ok(resPartner);
    }
}
