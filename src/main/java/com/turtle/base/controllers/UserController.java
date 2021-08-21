package com.turtle.base.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.turtle.base.models.User;
import com.turtle.base.repos.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController { 


	private final UserRepository userRepository;
	
	UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
    
   
}
