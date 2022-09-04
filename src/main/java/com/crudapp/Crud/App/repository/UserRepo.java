package com.crudapp.Crud.App.repository;

import com.crudapp.Crud.App.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
    User findByUsername(String username);
}
