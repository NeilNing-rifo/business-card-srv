package com.rifo.api.businesscardsrv.entity;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ResPartner {
    private Integer id;

    private String name;

    private Integer companyId;

    private String displayName;

    private Date date;

    private Integer title;

    private Integer parentId;

    private String ref;

    private String lang;

    private String tz;

    private Integer userId;

    private String vat;

    private String website;

    private String comment;

    private Double creditLimit;

    private String barcode;

    private Boolean active;

    private Boolean customer;

    private Boolean supplier;

    private Boolean employee;

    private String function;

    private String type;

    private String street;

    private String street2;

    private String zip;

    private String city;

    private Integer stateId;

    private Integer countryId;

    private String email;

    private String phone;

    private String mobile;

    private Boolean isCompany;

    private Integer industryId;

    private Integer color;

    private Boolean partnerShare;

    private Integer commercialPartnerId;

    private Integer commercialPartnerCountryId;

    private String commercialCompanyName;

    private String companyName;

    private Integer createUid;

    private Date createDate;

    private Integer messageBounce;

    private Boolean optOut;

    private Date activityDateDeadline;

    private Date messageLastPost;

    private String signupToken;

    private String signupType;

    private Date signupExpiration;

    private Date calendarLastNotifAck;

    private Integer teamId;

    private BigDecimal debitLimit;

    private Date lastTimeEntriesChecked;

    private String invoiceWarn;

    private String invoiceWarnMsg;

    private String saleWarn;

    private String saleWarnMsg;

    private String pickingWarn;

    private String pickingWarnMsg;

    private String purchaseWarn;

    private String purchaseWarnMsg;

    private String websiteDescription;

    private String websiteShortDescription;

    private Boolean websitePublished;

    private String websiteMetaTitle;

    private String websiteMetaDescription;

    private String websiteMetaKeywords;

    private String xBrokerageApptPhone;

    private String xFax;

    private String xSlogan;

    private Integer xAgentTitleId;

    private Integer xCimsUid;

    private String xWechat;

    private Integer xRatingForQuality;

    private Integer xRatingForTime;

    private Integer xRecommendation;

    private BigDecimal partnerLatitude;

    private BigDecimal partnerLongitude;

    private Date dateLocalization;

    private Integer xCategId;

    private Integer lastWebsiteSoId;

    private Integer xGender;

    private String customerId;

    private Integer xRifoYonghuId;

    private Integer xDingDepId;

    private String xLicense;

    private Boolean xShowingNoticeSms;

    private Boolean xShowingNoticeEmail;

    private String xDomain;

    private String xTemplate;

    private String xBannerUrl;

    private String xWebsiteTitle;

    private String xWechatQrcode;

    private String agentTitle;
    
    private byte[] xSignatureImage;
    
    private Date xBirthday;
    
    private String xFlyerHeader;
    
    private String xFlyerFooter;
    
    private Boolean xWebsiteStatus;

    private ResPartner company;
    
    private List<JSONObject> images;

    private String xFirstName,xLastName,xAgentCardUrl,xAgentCardBg;

    public void setCompany(ResPartner company) {
        this.company = company;
    }

    public String getxFirstName() {
        return xFirstName;
    }

    public void setxFirstName(String xFirstName) {
        this.xFirstName = xFirstName;
    }

    public String getxLastName() {
        return xLastName;
    }

    public void setxLastName(String xLastName) {
        this.xLastName = xLastName;
    }

    public String getxAgentCardUrl() {
        return xAgentCardUrl;
    }

    public void setxAgentCardUrl(String xAgentCardUrl) {
        this.xAgentCardUrl = xAgentCardUrl;
    }

    public String getxAgentCardBg() {
        return xAgentCardBg;
    }

    public void setxAgentCardBg(String xAgentCardBg) {
        this.xAgentCardBg = xAgentCardBg;
    }

    public List<JSONObject> getImages() {
		return images;
	}

	public void setImages(List<JSONObject> images) {
		this.images = images;
	}

	public ResPartner getCompany() {
		return company;
	}

	public String getAgentTitle() {
		return agentTitle;
	}

	public void setAgentTitle(String agentTitle) {
		this.agentTitle = agentTitle;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref == null ? null : ref.trim();
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz == null ? null : tz.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat == null ? null : vat.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getCustomer() {
        return customer;
    }

    public void setCustomer(Boolean customer) {
        this.customer = customer;
    }

    public Boolean getSupplier() {
        return supplier;
    }

    public void setSupplier(Boolean supplier) {
        this.supplier = supplier;
    }

    public Boolean getEmployee() {
        return employee;
    }

    public void setEmployee(Boolean employee) {
        this.employee = employee;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function == null ? null : function.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2 == null ? null : street2.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Boolean getIsCompany() {
        return isCompany;
    }

    public void setIsCompany(Boolean isCompany) {
        this.isCompany = isCompany;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Boolean getPartnerShare() {
        return partnerShare;
    }

    public void setPartnerShare(Boolean partnerShare) {
        this.partnerShare = partnerShare;
    }

    public Integer getCommercialPartnerId() {
        return commercialPartnerId;
    }

    public void setCommercialPartnerId(Integer commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId;
    }

    public Integer getCommercialPartnerCountryId() {
        return commercialPartnerCountryId;
    }

    public void setCommercialPartnerCountryId(Integer commercialPartnerCountryId) {
        this.commercialPartnerCountryId = commercialPartnerCountryId;
    }

    public String getCommercialCompanyName() {
        return commercialCompanyName;
    }

    public void setCommercialCompanyName(String commercialCompanyName) {
        this.commercialCompanyName = commercialCompanyName == null ? null : commercialCompanyName.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getMessageBounce() {
        return messageBounce;
    }

    public void setMessageBounce(Integer messageBounce) {
        this.messageBounce = messageBounce;
    }

    public Boolean getOptOut() {
        return optOut;
    }

    public void setOptOut(Boolean optOut) {
        this.optOut = optOut;
    }

    public Date getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public void setActivityDateDeadline(Date activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public Date getMessageLastPost() {
        return messageLastPost;
    }

    public void setMessageLastPost(Date messageLastPost) {
        this.messageLastPost = messageLastPost;
    }

    public String getSignupToken() {
        return signupToken;
    }

    public void setSignupToken(String signupToken) {
        this.signupToken = signupToken == null ? null : signupToken.trim();
    }

    public String getSignupType() {
        return signupType;
    }

    public void setSignupType(String signupType) {
        this.signupType = signupType == null ? null : signupType.trim();
    }

    public Date getSignupExpiration() {
        return signupExpiration;
    }

    public void setSignupExpiration(Date signupExpiration) {
        this.signupExpiration = signupExpiration;
    }

    public Date getCalendarLastNotifAck() {
        return calendarLastNotifAck;
    }

    public void setCalendarLastNotifAck(Date calendarLastNotifAck) {
        this.calendarLastNotifAck = calendarLastNotifAck;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public BigDecimal getDebitLimit() {
        return debitLimit;
    }

    public void setDebitLimit(BigDecimal debitLimit) {
        this.debitLimit = debitLimit;
    }

    public Date getLastTimeEntriesChecked() {
        return lastTimeEntriesChecked;
    }

    public void setLastTimeEntriesChecked(Date lastTimeEntriesChecked) {
        this.lastTimeEntriesChecked = lastTimeEntriesChecked;
    }

    public String getInvoiceWarn() {
        return invoiceWarn;
    }

    public void setInvoiceWarn(String invoiceWarn) {
        this.invoiceWarn = invoiceWarn == null ? null : invoiceWarn.trim();
    }

    public String getInvoiceWarnMsg() {
        return invoiceWarnMsg;
    }

    public void setInvoiceWarnMsg(String invoiceWarnMsg) {
        this.invoiceWarnMsg = invoiceWarnMsg == null ? null : invoiceWarnMsg.trim();
    }

    public String getSaleWarn() {
        return saleWarn;
    }

    public void setSaleWarn(String saleWarn) {
        this.saleWarn = saleWarn == null ? null : saleWarn.trim();
    }

    public String getSaleWarnMsg() {
        return saleWarnMsg;
    }

    public void setSaleWarnMsg(String saleWarnMsg) {
        this.saleWarnMsg = saleWarnMsg == null ? null : saleWarnMsg.trim();
    }

    public String getPickingWarn() {
        return pickingWarn;
    }

    public void setPickingWarn(String pickingWarn) {
        this.pickingWarn = pickingWarn == null ? null : pickingWarn.trim();
    }

    public String getPickingWarnMsg() {
        return pickingWarnMsg;
    }

    public void setPickingWarnMsg(String pickingWarnMsg) {
        this.pickingWarnMsg = pickingWarnMsg == null ? null : pickingWarnMsg.trim();
    }

    public String getPurchaseWarn() {
        return purchaseWarn;
    }

    public void setPurchaseWarn(String purchaseWarn) {
        this.purchaseWarn = purchaseWarn == null ? null : purchaseWarn.trim();
    }

    public String getPurchaseWarnMsg() {
        return purchaseWarnMsg;
    }

    public void setPurchaseWarnMsg(String purchaseWarnMsg) {
        this.purchaseWarnMsg = purchaseWarnMsg == null ? null : purchaseWarnMsg.trim();
    }

    public String getWebsiteDescription() {
        return websiteDescription;
    }

    public void setWebsiteDescription(String websiteDescription) {
        this.websiteDescription = websiteDescription == null ? null : websiteDescription.trim();
    }

    public String getWebsiteShortDescription() {
        return websiteShortDescription;
    }

    public void setWebsiteShortDescription(String websiteShortDescription) {
        this.websiteShortDescription = websiteShortDescription == null ? null : websiteShortDescription.trim();
    }

    public Boolean getWebsitePublished() {
        return websitePublished;
    }

    public void setWebsitePublished(Boolean websitePublished) {
        this.websitePublished = websitePublished;
    }

    public String getWebsiteMetaTitle() {
        return websiteMetaTitle;
    }

    public void setWebsiteMetaTitle(String websiteMetaTitle) {
        this.websiteMetaTitle = websiteMetaTitle == null ? null : websiteMetaTitle.trim();
    }

    public String getWebsiteMetaDescription() {
        return websiteMetaDescription;
    }

    public void setWebsiteMetaDescription(String websiteMetaDescription) {
        this.websiteMetaDescription = websiteMetaDescription == null ? null : websiteMetaDescription.trim();
    }

    public String getWebsiteMetaKeywords() {
        return websiteMetaKeywords;
    }

    public void setWebsiteMetaKeywords(String websiteMetaKeywords) {
        this.websiteMetaKeywords = websiteMetaKeywords == null ? null : websiteMetaKeywords.trim();
    }

    public String getxBrokerageApptPhone() {
        return xBrokerageApptPhone;
    }

    public void setxBrokerageApptPhone(String xBrokerageApptPhone) {
        this.xBrokerageApptPhone = xBrokerageApptPhone == null ? null : xBrokerageApptPhone.trim();
    }

    public String getxFax() {
        return xFax;
    }

    public void setxFax(String xFax) {
        this.xFax = xFax == null ? null : xFax.trim();
    }

    public String getxSlogan() {
        return xSlogan;
    }

    public void setxSlogan(String xSlogan) {
        this.xSlogan = xSlogan == null ? null : xSlogan.trim();
    }

    public Integer getxAgentTitleId() {
        return xAgentTitleId;
    }

    public void setxAgentTitleId(Integer xAgentTitleId) {
        this.xAgentTitleId = xAgentTitleId;
    }

    public Integer getxCimsUid() {
        return xCimsUid;
    }

    public void setxCimsUid(Integer xCimsUid) {
        this.xCimsUid = xCimsUid;
    }

    public String getxWechat() {
        return xWechat;
    }

    public void setxWechat(String xWechat) {
        this.xWechat = xWechat == null ? null : xWechat.trim();
    }

    public Integer getxRatingForQuality() {
        return xRatingForQuality;
    }

    public void setxRatingForQuality(Integer xRatingForQuality) {
        this.xRatingForQuality = xRatingForQuality;
    }

    public Integer getxRatingForTime() {
        return xRatingForTime;
    }

    public void setxRatingForTime(Integer xRatingForTime) {
        this.xRatingForTime = xRatingForTime;
    }

    public Integer getxRecommendation() {
        return xRecommendation;
    }

    public void setxRecommendation(Integer xRecommendation) {
        this.xRecommendation = xRecommendation;
    }

    public BigDecimal getPartnerLatitude() {
        return partnerLatitude;
    }

    public void setPartnerLatitude(BigDecimal partnerLatitude) {
        this.partnerLatitude = partnerLatitude;
    }

    public BigDecimal getPartnerLongitude() {
        return partnerLongitude;
    }

    public void setPartnerLongitude(BigDecimal partnerLongitude) {
        this.partnerLongitude = partnerLongitude;
    }

    public Date getDateLocalization() {
        return dateLocalization;
    }

    public void setDateLocalization(Date dateLocalization) {
        this.dateLocalization = dateLocalization;
    }

    public Integer getxCategId() {
        return xCategId;
    }

    public void setxCategId(Integer xCategId) {
        this.xCategId = xCategId;
    }

    public Integer getLastWebsiteSoId() {
        return lastWebsiteSoId;
    }

    public void setLastWebsiteSoId(Integer lastWebsiteSoId) {
        this.lastWebsiteSoId = lastWebsiteSoId;
    }

    public Integer getxGender() {
        return xGender;
    }

    public void setxGender(Integer xGender) {
        this.xGender = xGender;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Integer getxRifoYonghuId() {
        return xRifoYonghuId;
    }

    public void setxRifoYonghuId(Integer xRifoYonghuId) {
        this.xRifoYonghuId = xRifoYonghuId;
    }

    public Integer getxDingDepId() {
        return xDingDepId;
    }

    public void setxDingDepId(Integer xDingDepId) {
        this.xDingDepId = xDingDepId;
    }

    public String getxLicense() {
        return xLicense;
    }

    public void setxLicense(String xLicense) {
        this.xLicense = xLicense == null ? null : xLicense.trim();
    }

    public Boolean getxShowingNoticeSms() {
        return xShowingNoticeSms;
    }

    public void setxShowingNoticeSms(Boolean xShowingNoticeSms) {
        this.xShowingNoticeSms = xShowingNoticeSms;
    }

    public Boolean getxShowingNoticeEmail() {
        return xShowingNoticeEmail;
    }

    public void setxShowingNoticeEmail(Boolean xShowingNoticeEmail) {
        this.xShowingNoticeEmail = xShowingNoticeEmail;
    }

    public String getxDomain() {
        return xDomain;
    }

    public void setxDomain(String xDomain) {
        this.xDomain = xDomain == null ? null : xDomain.trim();
    }

    public String getxTemplate() {
        return xTemplate;
    }

    public void setxTemplate(String xTemplate) {
        this.xTemplate = xTemplate == null ? null : xTemplate.trim();
    }

    public String getxBannerUrl() {
        return xBannerUrl;
    }

    public void setxBannerUrl(String xBannerUrl) {
        this.xBannerUrl = xBannerUrl == null ? null : xBannerUrl.trim();
    }

    public String getxWebsiteTitle() {
        return xWebsiteTitle;
    }

    public void setxWebsiteTitle(String xWebsiteTitle) {
        this.xWebsiteTitle = xWebsiteTitle == null ? null : xWebsiteTitle.trim();
    }

    public String getxWechatQrcode() {
        return xWechatQrcode;
    }

    public void setxWechatQrcode(String xWechatQrcode) {
        this.xWechatQrcode = xWechatQrcode == null ? null : xWechatQrcode.trim();
    }

    public byte[] getxSignatureImage() {
        return xSignatureImage;
    }

    public void setxSignatureImage(byte[] xSignatureImage) {
        this.xSignatureImage = xSignatureImage;
    }

    public Date getxBirthday() {
        return xBirthday;
    }

    public void setxBirthday(Date xBirthday) {
        this.xBirthday = xBirthday;
    }

    public String getxFlyerHeader() {
        return xFlyerHeader;
    }

    public void setxFlyerHeader(String xFlyerHeader) {
        this.xFlyerHeader = xFlyerHeader;
    }

    public String getxFlyerFooter() {
        return xFlyerFooter;
    }

    public void setxFlyerFooter(String xFlyerFooter) {
        this.xFlyerFooter = xFlyerFooter;
    }

    public Boolean getxWebsiteStatus() {
        return xWebsiteStatus;
    }

    public void setxWebsiteStatus(Boolean xWebsiteStatus) {
        this.xWebsiteStatus = xWebsiteStatus;
    }
    
}