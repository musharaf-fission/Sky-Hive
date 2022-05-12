package com.practice.MapStructExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.MapStructExample.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
