package com.careerdevs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PokemonAPIcontroller {
    public static final String pokemon = "https://pokeapi.co/api/v2/pokemon/1";

    @GetMapping("/pokemon")
    public Pokemon monInfo(RestTemplate restTemplate){
        String URL = pokemon;

        Pokemon mon = restTemplate.getForObject(URL, Pokemon.class);

        return mon;
    }
}
