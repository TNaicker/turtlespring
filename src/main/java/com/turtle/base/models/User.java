package com.turtle.base.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    
    public User() {
    	
    }
    
    public User(String name, String email) {
    	this.name = name;
    	this.email = email;
    }
    
    public String getName() {
    	return this.name;
    }
    public String getEmail() {
    	return this.email;
    }
    
}
