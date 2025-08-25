package com.Luldle.Luldle.dto;

import jakarta.validation.constraints.NotBlank;

public class SuggestChampionRequest {
    @NotBlank
    private String championNameFragment;

    public SuggestChampionRequest(){}

    public SuggestChampionRequest(String championNameFragment){
        this.championNameFragment = championNameFragment;
    }

    public String getChampionNameFragment() {
        return championNameFragment;
    }

    public void setChampionNameFragment(String championNameFragment) {
        this.championNameFragment = championNameFragment;
    }
}
