package com.crudapp.Crud.App.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor

@Document
public class User {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String mobileno;
    private String username;
    private String password;
}
