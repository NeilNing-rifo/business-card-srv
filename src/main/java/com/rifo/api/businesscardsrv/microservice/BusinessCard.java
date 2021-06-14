package com.rifo.api.businesscardsrv.microservice;

import org.apache.commons.lang3.StringUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public final class BusinessCard {

    private String backGroundUrl, profileUrl, qrCodeUrl;
    private String name, firstName, lastName, mobile, email;

    private BufferedImage card, backGround, profile, qrCode;

    private int cardWidth = 1143, cardHeight = 664,
            profileWidth = 200, profileHeight = 200,
            qrCodeWidth = 170, qrCodeHeight = 170;
    private int xCircleCenter = 194, yCircleCenter = 152;

    BusinessCard(BusinessCardBuilder builder){
        this.backGroundUrl = builder.backGroundUrl;
        this.profileUrl = builder.profileUrl;
        this.qrCodeUrl = builder.qrCodeUrl;
        this.name = builder.name;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.mobile = builder.mobile;
        this.email = builder.email;
        this.backGround = builder.backGround;
        this.profile = builder.profile;
        this.qrCode = builder.qrCode;

        this.cardWidth = builder.cardWidth;
        this.cardHeight = builder.cardHeight;
        this.profileWidth = builder.profileWidth;
        this.profileHeight = builder.profileHeight;
        this.qrCodeWidth = builder.qrCodeWidth;
        this.qrCodeHeight = builder.qrCodeHeight;
    }

    public void generateBusinessCard() throws IOException {
        card = new BufferedImage(cardWidth, cardHeight, BufferedImage.TYPE_4BYTE_ABGR_PRE);

        // load background pic
        //BufferedImage backGroundImg = ImageIO.read(new URL(backGroundUrl));
        BufferedImage backGroundImg = backGroundUrl.startsWith("http")
                ? ImageIO.read(new URL(backGroundUrl)) : ImageIO.read(new File(backGroundUrl));
        // load profile
        BufferedImage profileImg = ImageIO.read(new URL(profileUrl));
        // load orcode
        BufferedImage qrImg = qrCodeUrl != null ? ImageIO.read(new URL(qrCodeUrl))
                : qrCode;

        /////////////////////draw a circle profile/////////////////////////
        BufferedImage circleProfileImage = new BufferedImage(profileWidth, profileHeight,
                BufferedImage.TYPE_4BYTE_ABGR_PRE);
        Graphics2D circlePG = circleProfileImage.createGraphics();

        circlePG.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // 留一个像素的空白区域，这个很重要，画圆的时候把这个覆盖
        int border = 5;
        // 图片是一个圆型
        Ellipse2D.Double shape = new Ellipse2D.Double(border, border, profileWidth - border * 2,
                profileHeight - border * 2);
        // 需要保留的区域
        circlePG.setClip(shape);
        circlePG.drawImage(profileImg, border, border, profileWidth - border * 2, profileHeight - border * 2,
                null);
        circlePG.dispose();
        //////////////////////////////////////////////

        Graphics2D cardG = card.createGraphics();

        // draw background
        cardG.drawImage(backGroundImg, 0, 0, cardWidth, cardHeight, null);
        cardG.setColor(Color.BLACK);

        Font font = new Font("Arial", Font.BOLD, 35);
        cardG.setFont(font);
        cardG.drawString(name, cardWidth / 3, 120);

        font = new Font("Arial", Font.PLAIN, 35);
        cardG.setFont(font);
        cardG.drawString("Sales Representative",cardWidth/3, 200);

        font = new Font("Arial", Font.BOLD, 35);
        cardG.setFont(font);
        mobile = formatPhone(mobile);
        cardG.drawString(mobile, cardWidth/3, 280);
        cardG.drawString(email, cardWidth/3, 360);

        // draw profile
        cardG.drawImage(circleProfileImage, (xCircleCenter - profileWidth / 2),
                (yCircleCenter - profileHeight / 2), profileWidth, profileHeight, null);

        // draw qrcode 在模板上添加用户二维码(地址,左边距,上边距,图片宽度,图片高度,未知)
        cardG.drawImage(qrImg, 900, 50, qrCodeWidth, qrCodeHeight, null);

        cardG.dispose();
    }

    private String formatPhone(String raw){
        int delimiterNum = 2;

        if(StringUtils.startsWith(raw,"+1")){
            raw = StringUtils.removeStart(raw, "+1");

            StringBuilder bf = new StringBuilder();
            int s = 0;
            for(int i = 1; i <= delimiterNum; i++, s+=3){
                bf.append(StringUtils.substring(raw, s, s + 3)).append(".");
            }

            bf.append(StringUtils.substring(raw, s));
            raw = bf.toString();
        }

        return raw;
    }

    public String getBackGroundUrl() {
        return backGroundUrl;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public BufferedImage getCard() {
        return card;
    }

    public BufferedImage getBackGround() {
        return backGround;
    }

    public BufferedImage getProfile() {
        return profile;
    }

    public BufferedImage getQrCode() {
        return qrCode;
    }
}
