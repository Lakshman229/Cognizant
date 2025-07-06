package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;

    public CountryServiceImpl(CountryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Country getCountryByCode(String code) {
        return repository.findByCountryCode(code);
    }

    @Override
    public Country saveCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public List<Country> getAllCountries() {
        return repository.findAll();
    }
}
