package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NationController {

    @GetMapping("/nation")
    public Nation getNation() {
        Nation nation = new Nation();
        nation.setName("Japan");
        nation.setCapital("Tokyo");
        return nation;
    }
}
