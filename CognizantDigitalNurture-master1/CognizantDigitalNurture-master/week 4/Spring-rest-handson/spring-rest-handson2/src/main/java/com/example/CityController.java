<<<<<<< HEAD
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @GetMapping("/city")
    public City1 getCity() {
        City1 city = new City1();
        city.setName("Vijayawada");
        city.setState("Andhra Pradesh");
        return city;
    }
}
=======
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @GetMapping("/city")
    public City1 getCity() {
        City1 city = new City1();
        city.setName("Vijayawada");
        city.setState("Andhra Pradesh");
        return city;
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
