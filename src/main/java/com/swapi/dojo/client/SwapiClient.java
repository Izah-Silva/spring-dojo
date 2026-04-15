package com.swapi.dojo.client;

import com.swapi.dojo.exception.ExternalApiException;
import com.swapi.dojo.configuration.SwapiProperties;
import com.swapi.dojo.dto.PeopleResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SwapiClient {

    private final RestTemplate restTemplate;
    private final SwapiProperties config;

        public SwapiClient(RestTemplate restTemplate, SwapiProperties config){
            this.restTemplate = restTemplate;
            this.config = config;
        }
        public PeopleResponse[] findPeople() {
            try {
                String url = config.getUrl() + "/people";
                return restTemplate.getForObject(url, PeopleResponse[].class);
            } catch (Exception ex) {
                throw new ExternalApiException("Erro ao conumir APi externa", ex);
            }

        }

    }

