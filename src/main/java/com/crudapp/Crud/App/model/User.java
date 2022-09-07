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

    @NonNull
    private String firstName;
    
    @NonNull
    private String lastName;
    
    @NonNull
    private String mobileno;
    
    @NonNull
    private String username;
    
    @NonNull
    private String password;
}
