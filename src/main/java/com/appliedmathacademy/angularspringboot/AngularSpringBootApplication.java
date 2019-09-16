package com.appliedmathacademy.angularspringboot;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.appliedmathacademy.angularspringboot.model.User;
import com.appliedmathacademy.angularspringboot.repository.UserRepository;

@SpringBootApplication
public class AngularSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringBootApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@domain.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }

}
