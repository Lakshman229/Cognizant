package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repo;

    public void addCountries() {
        repo.save(new Country("India", "Delhi"));
        repo.save(new Country("USA", "Washington"));
        repo.save(new Country("Japan", "Tokyo"));
    }

    public List<Country> getByNameHQL(String name) {
        return repo.findByCountryNameHQL(name);
    }

    public List<Country> getByCapitalNative(String capital) {
        return repo.findByCapitalNative(capital);
    }
}
