package com.farmfolio.traceability.dto;

import lombok.Data;

@Data
public class RegistrationResponse {
    private String id;
    private String success;
    private String message;
    private String auth;
    private String token;
    private String userType;
}
