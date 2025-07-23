package com.micro.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @GetMapping("/status")
    public String getLoanStatus() {
        return "Loan approved successfully!";
    }
}
