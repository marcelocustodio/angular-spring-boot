package com.appliedmathacademy.angularspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appliedmathacademy.angularspringboot.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}
