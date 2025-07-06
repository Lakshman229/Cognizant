package com.example.demo;


import java.util.List;

public interface CountryService {
    Country getCountryByCode(String code);
    Country saveCountry(Country country);
    List<Country> getAllCountries();  // optional
}
