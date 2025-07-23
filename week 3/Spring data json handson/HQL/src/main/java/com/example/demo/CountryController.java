package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/init")
    public String initData() {
        service.addCountries();
        return "Countries added!";
    }

    @GetMapping("/hql/{name}")
    public List<Country> getByHQL(@PathVariable String name) {
        return service.getByNameHQL(name);
    }

    @GetMapping("/native/{capital}")
    public List<Country> getByNative(@PathVariable String capital) {
        return service.getByCapitalNative(capital);
    }
}
