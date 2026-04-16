package com.swapi.dojo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PeopleResponse {
    private String name;
    private String height;
    private String mass;

}