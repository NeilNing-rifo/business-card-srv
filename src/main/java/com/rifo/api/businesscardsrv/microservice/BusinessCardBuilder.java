package com.rifo.api.businesscardsrv.microservice;

import java.awt.image.BufferedImage;

public final class BusinessCardBuilder {

    String backGroundUrl, profileUrl, qrCodeUrl;
    String name, firstName, lastName, mobile, email;

    int cardWidth = 1143, cardHeight = 664,
            profileWidth = 200, profileHeight = 200,
            qrCodeWidth = 170, qrCodeHeight = 170;

    BufferedImage backGround, profile, qrCode;

    private BusinessCardBuilder(){}

    public static BusinessCardBuilder newInstance(){
        return new BusinessCardBuilder();
    }

    public BusinessCardBuilder backGroundUrl(String backGroundUrl) {
        this.backGroundUrl = backGroundUrl;
        return this;
    }

    public BusinessCardBuilder profileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
        return this;
    }

    public BusinessCardBuilder qrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
        return this;
    }

    public BusinessCardBuilder name(String name) {
        this.name = name;
        return this;
    }

    public BusinessCardBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BusinessCardBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BusinessCardBuilder mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public BusinessCardBuilder email(String email) {
        this.email = email;
        return this;
    }

    public BusinessCardBuilder backGround(BufferedImage backGround) {
        this.backGround = backGround;
        return this;
    }

    public BusinessCardBuilder profile(BufferedImage profile) {
        this.profile = profile;
        return this;
    }

    public BusinessCardBuilder qrCode(BufferedImage qrCode) {
        this.qrCode = qrCode;
        return this;
    }

    public BusinessCard build(){
        return new BusinessCard(this);
    }
}
