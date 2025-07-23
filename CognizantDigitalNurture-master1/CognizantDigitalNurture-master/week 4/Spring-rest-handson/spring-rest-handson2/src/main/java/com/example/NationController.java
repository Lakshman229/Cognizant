<<<<<<< HEAD
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NationController {

    @GetMapping("/nation")
    public Nation getNation() {
        Nation nation = new Nation();
        nation.setName("Japan");
        nation.setCapital("Tokyo");
        return nation;
    }
}
=======
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NationController {

    @GetMapping("/nation")
    public Nation getNation() {
        Nation nation = new Nation();
        nation.setName("Japan");
        nation.setCapital("Tokyo");
        return nation;
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
