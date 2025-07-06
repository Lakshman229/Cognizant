package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/code/{code}")
    public Country getByCode(@PathVariable String code) {
        return countryService.getByCode(code);
    }

    @GetMapping("/continent/{continent}")
    public List<Country> getByContinent(@PathVariable String continent) {
        return countryService.getByContinent(continent);
    }
}
