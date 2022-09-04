package com.crudapp.Crud.App.service;


import com.crudapp.Crud.App.model.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User addUser(User user);

    List<User> getAllUsers();


    User getUserbyUsername(String username);

    String deleteUser(String id);

    String updateUser(User user);
}
