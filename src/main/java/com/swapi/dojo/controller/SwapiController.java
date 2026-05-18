package com.swapi.dojo.controller;

import com.swapi.dojo.dto.PeopleResponse;
import com.swapi.dojo.service.SwapiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/people")
public class SwapiController {
   private final SwapiService swapiService;
   public SwapiController(SwapiService swapiService) {
       this.swapiService = swapiService;
   }

   @GetMapping("/{id}")
    public ResponseEntity<PeopleResponse> getPersonById(@PathVariable Long id) {
       PeopleResponse response = swapiService.getPersonById(id);
       return ResponseEntity.ok(response);
   }
}

