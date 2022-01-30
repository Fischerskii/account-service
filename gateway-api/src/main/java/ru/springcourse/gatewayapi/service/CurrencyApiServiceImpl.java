package ru.springcourse.gatewayapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class CurrencyApiServiceImpl implements CurrencyApiService {

    @Value("${spring.security.oauth2.client.registration.auth0.client-id}")
    private String clientId;
    @Value("${spring.security.oauth2.client.registration.auth0.client-secret}")
    private String clientSecret;
    @Value("${service.stock.audience}")
    private String audience;

    @Value("${service.stock.uri}")
    private String uri;
    @Value("${service.stock.path.stock-quotes}")
    private String stockQuotes;

    private final RestTemplate restTemplate;
    private final TokenApiService tokenApiService;

    @Override
    public String getAllExchange() {
        return null;
    }

    @Override
    public String convert() {
        return null;
    }
}