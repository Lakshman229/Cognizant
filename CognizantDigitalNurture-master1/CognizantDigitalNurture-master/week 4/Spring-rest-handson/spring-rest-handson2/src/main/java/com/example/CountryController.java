<<<<<<< HEAD
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {
        Country country = new Country();
        country.setName("India");
        country.setCapital("New Delhi");
        return country;
    }
}
=======
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {
        Country country = new Country();
        country.setName("India");
        country.setCapital("New Delhi");
        return country;
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
