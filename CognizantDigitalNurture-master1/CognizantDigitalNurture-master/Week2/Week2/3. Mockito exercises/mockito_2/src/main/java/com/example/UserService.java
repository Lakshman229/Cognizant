<<<<<<< HEAD
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
=======
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
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
