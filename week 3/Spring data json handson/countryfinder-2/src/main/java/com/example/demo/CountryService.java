package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public Country save(Country country) {
        return repository.save(country);
    }

    public List<Country> getByContinent(String continent) {
        return repository.findByContinent(continent);
    }

    public Country getByName(String name) {
        return repository.findByName(name);
    }

    public Country getByCodeAndContinent(String code, String continent) {
        return repository.findByCountryCodeAndContinent(code, continent);
    }
}
