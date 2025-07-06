package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 3, unique = true)
    private String countryCode;

    private String continent;
    private String capital;

    public Country() {}

    public Country(String name, String countryCode, String continent, String capital) {
        this.name = name;
        this.countryCode = countryCode;
        this.continent = continent;
        this.capital = capital;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCountryCode() { return countryCode; }

    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }

    public String getContinent() { return continent; }

    public void setContinent(String continent) { this.continent = continent; }

    public String getCapital() { return capital; }

    public void setCapital(String capital) { this.capital = capital; }
}
