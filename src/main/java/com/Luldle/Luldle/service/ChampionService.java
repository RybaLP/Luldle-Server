package com.Luldle.Luldle.service;


import com.Luldle.Luldle.dto.GuessChampionResponse;
import com.Luldle.Luldle.enums.YearEnum;
import com.Luldle.Luldle.repository.ChampionRepository;
import com.Luldle.Luldle.model.Champion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ChampionService {

    private final ChampionRepository championRepository;
    private final JwtService jwtService;

    public ChampionService(ChampionRepository championRepository, JwtService jwtService){
        this.championRepository = championRepository;
        this.jwtService = jwtService;
    }

    public Champion generateRandomChampion() throws Exception {
        List<Champion> championList = championRepository.findAll();
        int randomIndex = (int) (Math.random() * championList.size());
        Champion randomChampion = championList.get(randomIndex);
        return randomChampion;
    }

    public GuessChampionResponse guessChampion (String championName, String jwt) {

        try {

            Champion guessedChampion = championRepository.findByName(championName);
            String championFromToken = jwtService.extractChampionName(jwt);
            Champion generatedChampion = championRepository.findByName(championFromToken);

            GuessChampionResponse response = new GuessChampionResponse();

            if (guessedChampion == null || generatedChampion == null){
                return response;
            }

            response.setCorrectName(Objects.equals(
                    guessedChampion.getName(), generatedChampion.getName()
            ));

            response.setCorrectGender(Objects.equals(
                    guessedChampion.getGender(), generatedChampion.getGender()
            ));

            response.setCorrectPosition(Objects.equals(
                    guessedChampion.getPosition(), generatedChampion.getPosition()
            ));

            response.setCorrectSpecy(Objects.equals(
                    guessedChampion.getSpecy(), generatedChampion.getSpecy())
            );

            response.setCorrectResource(Objects.equals(
                    guessedChampion.getResource(), generatedChampion.getResource()
            ));

            response.setCorrectRangeType(Objects.equals(
                    guessedChampion.getRange_type(), generatedChampion.getRange_type()
            ));

            response.setCorrectRegion(Objects.equals(
                    generatedChampion.getRegion(), guessedChampion.getRegion()
            ));

            response.setCorrectYearOfRelease(Objects.equals(
                    generatedChampion.getYear_of_release(), guessedChampion.getYear_of_release()
            ));

            if (response.isCorrectName()){
                response.setCorrectAnswer(true);
            }

            response.setChampionObject(guessedChampion);

            System.out.println("guessed champion" + guessedChampion);
            System.out.println("generated c" + generatedChampion.getName());

            if (generatedChampion.getYear_of_release() > guessedChampion.getYear_of_release()){
                response.setYearHint(YearEnum.UP);
            }

            if (generatedChampion.getYear_of_release() == guessedChampion.getYear_of_release()){
                response.setYearHint(YearEnum.CORRECT);
            }

            if (generatedChampion.getYear_of_release() < guessedChampion.getYear_of_release()){
                response.setYearHint(YearEnum.DOWN);
            }

            return response;

        } catch(Exception e) {
            System.out.println("Wysytabil blad w serwise");
            e.printStackTrace();
            return new GuessChampionResponse();
        }

    }
}
