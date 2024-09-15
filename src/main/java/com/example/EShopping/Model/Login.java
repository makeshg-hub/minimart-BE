package com.example.EShopping.Model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Login {
    @NotEmpty(message = "userName is mandatory")
    private String userName;

    @NotEmpty(message = "Password is mandatory")
    private String password;
    
}
