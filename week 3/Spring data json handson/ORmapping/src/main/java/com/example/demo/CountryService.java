package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getByCode(String code) {
        return countryRepository.findByCountryCode(code);
    }

    public List<Country> getByContinent(String continent) {
        return countryRepository.findByContinent(continent);
    }
}
