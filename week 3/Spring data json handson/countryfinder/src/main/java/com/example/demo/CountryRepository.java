package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByCountryCode(String countryCode);  // Spring generates this query
}
