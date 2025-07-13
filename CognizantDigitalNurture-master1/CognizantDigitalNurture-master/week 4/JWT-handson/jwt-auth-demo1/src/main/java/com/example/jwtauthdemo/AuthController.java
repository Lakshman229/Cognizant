package com.example.jwtauthdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
            return jwtUtil.generateToken(user.getUsername());
        } else {
            return "Invalid credentials";
        }
    }

    @GetMapping("/secure")
    public String secure() {
        return "You have accessed a secured endpoint!";
    }
}
