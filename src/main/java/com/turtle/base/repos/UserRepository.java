package com.turtle.base.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.turtle.base.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}
