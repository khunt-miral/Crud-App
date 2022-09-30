package com.crudapp.Crud.App.service;

import com.crudapp.Crud.App.model.User;
import com.crudapp.Crud.App.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User addUser(User user) {
        if(Objects.equals(user.getLastName(),"")|| Objects.equals(user.getFirstName(), "")||Objects.equals(user.getMobileno(),"")||Objects.equals(user.getUsername(),"")||Objects.equals(user.getPassword(),"")){
            throw new IllegalArgumentException("Some fields are missing");
        }
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserbyUsername(String username){
        return userRepo.findByUsername(username);
    }

    @Override
    public String deleteUser(String id) {
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
            return "User deleted successfully";
        } else {
            return "User does not exist";
        }
    }

    @Override
    public String updateUser(User user) {
        if (userRepo.existsById(user.getId())) {
            userRepo.save(user);
            return "User updated successfully with username " + user.getUsername();
        } else return "User does not exist";
    }


}
