package com.example.spbrestdocs;

import lombok.Builder;

import java.time.LocalDate;


public class PersonDto {

    @Builder
    public class Response {
        private Long id;
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private String hobby;
    }
}
