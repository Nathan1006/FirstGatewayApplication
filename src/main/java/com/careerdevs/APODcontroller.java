package com.careerdevs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class APODcontroller{
    public static final String My_Api_Key = "lY8deGLA73qHeBSzv5PcDBDOcwAVihUi9RDO1yag";

    @GetMapping ("/")
    public String rootRoute(){
        return "Welcome Home!";
    }

    @GetMapping ("apod")
    public APOD apodInfo(RestTemplate restTemplate){
        String URL = "https://api.nasa.gov/planetary/apod?api_key=" + My_Api_Key;

        APOD apod = restTemplate.getForObject(URL, APOD.class);

        return apod;
    }

    @GetMapping("/apodtest")
    public String apodTest(){

        return "APOD Testing!";
    }

    @PostMapping("/apod")
    public String postApod () {
        return "POST APOD";
    }
}
