package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @PostMapping("/add")
    public Country addCountry(@RequestBody Country country) {
        return service.save(country);
    }

    @GetMapping("/continent/{continent}")
    public List<Country> getByContinent(@PathVariable String continent) {
        return service.getByContinent(continent);
    }

    @GetMapping("/name/{name}")
    public Country getByName(@PathVariable String name) {
        return service.getByName(name);
    }

    @GetMapping("/code/{code}/continent/{continent}")
    public Country getByCodeAndContinent(@PathVariable String code, @PathVariable String continent) {
        return service.getByCodeAndContinent(code, continent);
    }
}
