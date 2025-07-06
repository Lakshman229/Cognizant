package com.example.demo;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return service.saveCountry(country);
    }

    @GetMapping("/code/{code}")
    public Country getByCode(@PathVariable String code) {
        return service.getCountryByCode(code);
    }

    @GetMapping
    public List<Country> getAll() {
        return service.getAllCountries();
    }
}
