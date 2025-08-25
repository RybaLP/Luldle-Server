package com.Luldle.Luldle.dto;

import jakarta.validation.constraints.NotBlank;

public class GuessChampionRequest {

    @NotBlank(message = "Champion name is required")
    private String championName;

    public GuessChampionRequest() {
    }

    public String getChampionName(){
        return this.championName;
    }

    public void setChampionName(String championName){
        this.championName = championName;
    }
}
