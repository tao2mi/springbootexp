package com.ybq.sbexp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangb
 */
@Configuration
public class Configuration1 {

    @Bean
    public RestTemplate restTemplateTTTT() {
        return new RestTemplate();
    }
}
