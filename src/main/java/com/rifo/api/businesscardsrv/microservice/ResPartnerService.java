package com.rifo.api.businesscardsrv.microservice;

import com.rifo.api.businesscardsrv.entity.ResPartner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@Component
public class ResPartnerService {

    @Value("${microservice.auth.respartner}")
    private String authSrvRespartner;

    @Value("${microservice.bims.picurl}")
    private String bimsImgUrl;

    private RestTemplate restTemplate;

    public ResPartnerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    //@PostConstruct
    public ResPartner getResPartnerWithCompany(Integer id) {

        String getRespartnerurl = UriComponentsBuilder.fromHttpUrl(authSrvRespartner)
                .buildAndExpand(id).toUriString();

        log.info("getRespartnerurl is [{}]", getRespartnerurl);

        ResponseEntity<ResPartner> resp = restTemplate
                .getForEntity(getRespartnerurl, ResPartner.class);

        return resp.getBody();
    }

    public byte[] getResPartnerPicture(Integer partnerId) {

        String url = UriComponentsBuilder.fromHttpUrl(bimsImgUrl)
                .buildAndExpand(partnerId).toUriString();

        log.info("get ResPartner Image url is [{}]", url);

        ResponseEntity<byte[]> resp = restTemplate
                .getForEntity(url, byte[].class);
        return resp.getStatusCode().is2xxSuccessful() ?
                resp.getHeaders().getContentLength() == 1192 ? null
                        : resp.getBody() : null;
    }

}
