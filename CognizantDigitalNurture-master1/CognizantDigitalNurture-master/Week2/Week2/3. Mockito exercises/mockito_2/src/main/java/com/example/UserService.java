package com.example;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getUsername(int id) {
        return repository.findUsernameById(id);
    }
}
