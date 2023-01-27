package com.example.spbrestdocs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/health_check")
    public String healthCheck() {
        return "OK";
    }

}
