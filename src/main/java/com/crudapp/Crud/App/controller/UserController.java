package com.crudapp.Crud.App.controller;

import com.crudapp.Crud.App.model.User;
import com.crudapp.Crud.App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }
    @PostMapping("/addUser")
    public User register(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
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
