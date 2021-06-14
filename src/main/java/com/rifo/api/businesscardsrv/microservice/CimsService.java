package com.rifo.api.businesscardsrv.microservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@Component
public class CimsService {

    @Value("${microservice.cims.genQrCode}")
    private String genQrCodeUrl;

    private RestTemplate restTemplate;

    public CimsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public byte[] generateOrCode(String content, int width, int height) {


        String qrcodeUrl = UriComponentsBuilder.fromHttpUrl(genQrCodeUrl)
                .queryParam("width", width)
                .queryParam("height",height)
                .build().toUriString();

        log.info("generateOrCode url is [{}]", qrcodeUrl);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.TEXT_PLAIN);

        HttpEntity<String> httpEntity = new HttpEntity<>(content, httpHeaders);

        ResponseEntity<byte[]> resp = restTemplate.postForEntity(qrcodeUrl, httpEntity, byte[].class);

        return resp.getBody();
    }
}
