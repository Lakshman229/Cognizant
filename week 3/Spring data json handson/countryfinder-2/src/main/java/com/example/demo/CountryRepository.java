package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByName(String name);
    List<Country> findByContinent(String continent);
    Country findByCountryCodeAndContinent(String countryCode, String continent);
}
