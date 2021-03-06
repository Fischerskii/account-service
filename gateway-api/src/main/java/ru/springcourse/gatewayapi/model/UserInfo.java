package ru.springcourse.gatewayapi.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class UserInfo {

    private String id;
    private List<String> roles;
}
