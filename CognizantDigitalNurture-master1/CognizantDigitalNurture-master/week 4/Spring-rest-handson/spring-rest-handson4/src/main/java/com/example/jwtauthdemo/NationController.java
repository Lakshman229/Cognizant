<<<<<<< HEAD
package com.example.jwtauthdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class NationController {

    @Autowired
    private NationService nationService;

    @GetMapping("/{code}")
    public Nation getNation(@PathVariable String code) {
        return nationService.getNationByCode(code);
    }
}
=======
package com.example.jwtauthdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class NationController {

    @Autowired
    private NationService nationService;

    @GetMapping("/{code}")
    public Nation getNation(@PathVariable String code) {
        return nationService.getNationByCode(code);
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
