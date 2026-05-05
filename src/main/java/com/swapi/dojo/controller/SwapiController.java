package com.swapi.dojo.controller;

import com.swapi.dojo.dto.PeopleResponse;
import com.swapi.dojo.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SwapiController {
   private final SwapiService swapiService;
   public SwapiController(SwapiService swapiService) {
       this.swapiService = swapiService;
   }

   @GetMapping("/people/{id}")
    public PeopleResponse getPersonById(@PathVariable Long id) {
        return swapiService.getPersonById(id);
   }
}

