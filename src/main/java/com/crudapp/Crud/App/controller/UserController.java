package com.crudapp.Crud.App.controller;

import com.crudapp.Crud.App.model.User;
import com.crudapp.Crud.App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User register(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(User user){
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getUserbyUsername(@PathVariable String username){
        return userService.getUserbyUsername(username);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        return userService.deleteUser(id);
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
