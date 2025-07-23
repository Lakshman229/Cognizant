package com.micro.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AutoController {

    // GET: Static account info
    @GetMapping("/info")
    public String getAccountInfo() {
        return "Account Service is active and running!";
    }

    // GET: Dynamic account details by account number
    @GetMapping("/{accountNumber}")
    public String getAccountDetails(@PathVariable String accountNumber) {
        // Simulated logic
        return "Details for account number: " + accountNumber;
    }

    // POST: Create new account
    @PostMapping("/create")
    public String createAccount(@RequestBody AccountRequest accountRequest) {
        return "Account created for: " + accountRequest.getAccountHolderName();
    }

    // Inner DTO class for request body
    public static class AccountRequest {
        private String accountHolderName;
        private String accountType;

        // Getters and setters
        public String getAccountHolderName() {
            return accountHolderName;
        }

        public void setAccountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
        }

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }
    }
}
