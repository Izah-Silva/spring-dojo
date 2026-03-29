package com.swapi.dojo.client;

import com.swapi.dojo.dto.PeopleResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SwapiClient {
    private final RestTemplate restTemplate;
        public SwapiClient(RestTemplate restTemplate){
            this.restTemplate = restTemplate;
        }
        public PeopleResponse[] searchPeople() {
            String url = "https://swapi.info/api/people";

            return restTemplate.getForObject(url, PeopleResponse[].class);
        }
    }

