package com.example.mongoJAVA.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data @Document(collection="users")
@NoArgsConstructor @AllArgsConstructor
public class User {
    @Id
    private long userId;
    private String username;
    private String name;
    private String email;
    private String password;
    private Date regDate;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
