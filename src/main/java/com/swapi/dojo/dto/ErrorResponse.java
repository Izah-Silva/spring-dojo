package com.swapi.dojo.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponse (
    LocalDateTime timestamp,
    HttpStatus status,
    String message

){}