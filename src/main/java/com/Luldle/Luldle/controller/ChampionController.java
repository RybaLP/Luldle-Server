package com.Luldle.Luldle.controller;

import com.Luldle.Luldle.dto.*;
import com.Luldle.Luldle.model.Champion;
import com.Luldle.Luldle.repository.ChampionRepository;
import com.Luldle.Luldle.service.ChampionService;
import com.Luldle.Luldle.service.JwtService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ChampionController {

    private final ChampionService championService;
    private final JwtService jwtService;

    private final ChampionRepository championRepository;

    public ChampionController(ChampionService championService, JwtService jwtService,ChampionRepository championRepository){
        this.championService = championService;
        this.jwtService = jwtService;
        this.championRepository = championRepository;
    }

    @GetMapping("/generate")
    public ResponseEntity<GenerateJwtResponse> generateRandomChampion() throws Exception {
        Champion generateChampion = championService.generateRandomChampion();

        Map<String, Object> claims = new HashMap<>();
        claims.put("championName", generateChampion.getName());
        String jwtToken = jwtService.generateJwtToken(claims);

        GenerateJwtResponse jwtResponse = new GenerateJwtResponse(jwtToken);

        return ResponseEntity.ok(jwtResponse);
    }

    @PostMapping("/compare")
    public ResponseEntity<GuessChampionResponse> compareChampions (@Valid @RequestBody GuessChampionRequest request , @RequestHeader(name = "Authorization") String authorizationHeader)
    {

        System.out.println(authorizationHeader + "this is my jwt");

        String jwt = jwtService.extractTokenFromHeader(authorizationHeader);

        System.out.printf("Jwt" + jwt);

        if (jwt == null) {
            return ResponseEntity.status(401).body(null);
        }

        System.out.println("Before comparing");
        GuessChampionResponse response = championService.guessChampion(request.getChampionName(), jwt);
        System.out.println("after comparing");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Champion>> findAllChampions(){
        List<Champion> allChampions = championRepository.findAll();
        return ResponseEntity.ok(allChampions);
    }
}