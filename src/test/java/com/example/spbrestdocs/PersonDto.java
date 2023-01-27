package com.example.spbrestdocs;

import lombok.Builder;

import java.util.Date;

@Builder
public class PersonDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String hobby;
}
