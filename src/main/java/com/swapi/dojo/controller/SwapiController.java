package com.swapi.dojo.controller;

import com.swapi.dojo.dto.PeopleResponse;
import com.swapi.dojo.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SwapiController {
   private final SwapiService swapiService;
   public SwapiController(SwapiService swapiService) {
       this.swapiService = swapiService;
   }

   @GetMapping("/people")
    public PeopleResponse[] getPeople() {
       return swapiService.getPeople();
   }
}

