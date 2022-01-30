package ru.springcourse.gatewayapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class RestConfig {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}