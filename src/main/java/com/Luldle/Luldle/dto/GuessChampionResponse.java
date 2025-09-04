package com.Luldle.Luldle.dto;

import com.Luldle.Luldle.enums.YearEnum;
import com.Luldle.Luldle.model.Champion;

public class GuessChampionResponse {
    private boolean isCorrectName;
    private boolean isCorrectGender;
    private boolean isCorrectPosition;
    private boolean isCorrectSpecy;
    private boolean isCorrectResource;
    private boolean isCorrectRangeType;
    private boolean isCorrectRegion;
    private boolean isCorrectYearOfRelease;
    private boolean isCorrectAnswer;

    private YearEnum yearHint;

    private Champion championObject;

    public void setChampionObject(Champion championObject){
        this.championObject = championObject;
    }

    public Champion getChampionObject(){
        return this.championObject;
    }

    public void setYearHint(YearEnum yearHint){
        this.yearHint = yearHint;
    }

    public YearEnum getYearHint(){
        return this.yearHint;
    }

    public boolean isCorrectResource() {
        return isCorrectResource;
    }

    public void setCorrectResource(boolean correctResource) {
        isCorrectResource = correctResource;
    }

    public boolean isCorrectName() {
        return isCorrectName;
    }

    public void setCorrectName(boolean correctName) {
        isCorrectName = correctName;
    }

    public boolean isCorrectGender() {
        return isCorrectGender;
    }

    public void setCorrectGender(boolean correctGender) {
        isCorrectGender = correctGender;
    }

    public boolean isCorrectSpecy() {
        return isCorrectSpecy;
    }

    public void setCorrectSpecy(boolean correctSpecy) {
        isCorrectSpecy = correctSpecy;
    }

    public boolean isCorrectPosition() {
        return isCorrectPosition;
    }

    public void setCorrectPosition(boolean correctPosition) {
        isCorrectPosition = correctPosition;
    }

    public boolean isCorrectRegion() {
        return isCorrectRegion;
    }

    public void setCorrectRegion(boolean correctRegion) {
        isCorrectRegion = correctRegion;
    }

    public boolean isCorrectRangeType() {
        return isCorrectRangeType;
    }

    public void setCorrectRangeType(boolean correctRangeType) {
        isCorrectRangeType = correctRangeType;
    }

    public boolean isCorrectYearOfRelease() {
        return isCorrectYearOfRelease;
    }

    public void setCorrectYearOfRelease(boolean correctYearOfRelease) {
        isCorrectYearOfRelease = correctYearOfRelease;
    }

    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        isCorrectAnswer = correctAnswer;
    }

    public GuessChampionResponse() {}

}
