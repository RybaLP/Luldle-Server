package com.Luldle.Luldle.dto;

import com.Luldle.Luldle.model.Champion;

import java.util.List;

public class SuggestChampionResponse {

    private List<Champion> suggestChampionResponse;

    public List<Champion> getSuggestChampionResponse() {
        return suggestChampionResponse;
    }

    public void setSuggestChampionResponse(List<Champion> suggestChampionResponse) {
        this.suggestChampionResponse = suggestChampionResponse;
    }

    public SuggestChampionResponse(List<Champion> suggestChampionResponse) {
        this.suggestChampionResponse = suggestChampionResponse;
    }

    public SuggestChampionResponse(){}
}
