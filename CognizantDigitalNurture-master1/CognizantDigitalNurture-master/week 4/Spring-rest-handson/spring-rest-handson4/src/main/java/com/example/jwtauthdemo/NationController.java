package com.example.jwtauthdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class NationController {

    @Autowired
    private NationService nationService;

    @GetMapping("/{code}")
    public Nation getNation(@PathVariable String code) {
        return nationService.getNationByCode(code);
    }
}
