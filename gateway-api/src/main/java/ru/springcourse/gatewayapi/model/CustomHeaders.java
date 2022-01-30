package ru.springcourse.gatewayapi.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomHeaders {

    private String accessToken;

    private String userInfo;
}