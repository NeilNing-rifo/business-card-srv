package com.rifo.api.businesscardsrv.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Configuration
public class WebConfig {
    private static final Logger logger = LoggerFactory.getLogger(WebConfig.class);

    @Bean
    public RestTemplate initRestTemplate(RestTemplateBuilder builder) {
        logger.info("----->start initializing of initRestTemplate");
        RestTemplate restTemplate = builder.build();
        restTemplate.getMessageConverters()
                .set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));

        restTemplate.setErrorHandler(new DefaultResponseErrorHandler(){
            @Override
            protected boolean hasError(HttpStatus statusCode) {
                return super.hasError(statusCode);
            }

            @Override
            public void handleError(ClientHttpResponse response) throws IOException {
                byte[] body = this.getResponseBody(response);
                int rawCode = response.getRawStatusCode();
                String statusTxt = response.getStatusText();

                logger.error("A Http call failed with details RawStatusCode:[{}], StatusText:[{}], body:[{}]",
                        rawCode, statusTxt, Arrays.toString(body));
            }
        });
        logger.info("----->end initializing of initRestTemplate");
        return restTemplate;
    }
}
