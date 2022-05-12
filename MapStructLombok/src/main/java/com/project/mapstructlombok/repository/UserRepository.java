package com.project.mapstructlombok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.mapstructlombok.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
