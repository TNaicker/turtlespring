package com.turtle.base;

import java.util.stream.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.turtle.base.models.User;
import com.turtle.base.repos.UserRepository;

@SpringBootApplication
public class MoneyApp {

	public static void main(String[] args) {
		SpringApplication.run(MoneyApp.class, args);

	}
	
    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@domain.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(x -> {
            	System.out.println(x.getName());
            	System.out.println(x.getEmail());
            	System.out.println("=======");
            });
        };
    }

}
