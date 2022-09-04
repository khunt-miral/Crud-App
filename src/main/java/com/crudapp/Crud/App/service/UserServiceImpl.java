package com.crudapp.Crud.App.service;

import com.crudapp.Crud.App.model.User;
import com.crudapp.Crud.App.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserbyUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public String deleteUser(String id) {
        userRepo.deleteById(id);
        return "User deleted successfully";
    }

    @Override
    public String updateUser(User user) {
        if(userRepo.existsById(user.getId())){
            userRepo.save(user);
            return "User updated successfully with username " + user.getUsername();
        }else
            return "User does not exist";
    }


}