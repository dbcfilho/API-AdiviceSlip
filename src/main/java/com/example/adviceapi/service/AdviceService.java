package com.example.adviceapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdviceService {

    private final String ADVICE_API_URL = "https://api.adviceslip.com/advice";

    public String getAdvice() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(ADVICE_API_URL, String.class);
        return response;
    }
}
