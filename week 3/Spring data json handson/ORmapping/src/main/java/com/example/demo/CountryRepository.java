package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {
    List<Country> findByContinent(String continent);
    Country findByCountryCode(String countryCode);
}
