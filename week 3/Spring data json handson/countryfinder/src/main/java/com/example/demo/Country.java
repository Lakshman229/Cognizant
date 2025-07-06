package com.example.demo;
import jakarta.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String capital;
    private String continent;
    private String countryCode;  // <-- key field to search by

    public Country() {}

    public Country(String name, String capital, String continent, String countryCode) {
        this.name = name;
        this.capital = capital;
        this.continent = continent;
        this.countryCode = countryCode;
    }

    // Getters and Setters
    // (Generate via IDE or write manually)
}
