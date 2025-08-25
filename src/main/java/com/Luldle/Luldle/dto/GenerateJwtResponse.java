package com.Luldle.Luldle.dto;

public class GenerateJwtResponse {

    private String jwtToken;

    public GenerateJwtResponse(){}

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public GenerateJwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
