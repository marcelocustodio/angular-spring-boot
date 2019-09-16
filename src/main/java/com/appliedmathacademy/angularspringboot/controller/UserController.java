package com.appliedmathacademy.angularspringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appliedmathacademy.angularspringboot.model.User;
import com.appliedmathacademy.angularspringboot.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
 
    // standard constructors
	// Fonte: https://www.baeldung.com/spring-boot-angular-web
     
    private UserRepository userRepository;
 
    @GetMapping("/users")
    public List<User> getUsers() {
    	User user = new User("Marcelo", "marcelo@domain.com");
        //userRepository.save(user);
    	System.out.println("Passou por aqui ....Angular chamou!");
    	List<User> l = new ArrayList<User>();
    	l.add(user);
        return l; //(List<User>) userRepository.findAll();
    }
 
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}