package com.swapi.dojo.service;

import com.swapi.dojo.client.SwapiClient;
import com.swapi.dojo.dto.PeopleResponse;
import org.springframework.stereotype.Service;

@Service
public class SwapiService {
    private final SwapiClient swapiClient;
    public SwapiService(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }
    public PeopleResponse[] getPeople() {
        return swapiClient.searchPeople();
    }

}
