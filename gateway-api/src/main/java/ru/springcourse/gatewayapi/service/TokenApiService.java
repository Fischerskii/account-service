package ru.springcourse.gatewayapi.service;

public interface TokenApiService {

    String getToken(String clientId, String clientSecret, String audience);
}
