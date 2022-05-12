package com.project.mapstructlombok.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.mapstructlombok.dto.UserDTO;
import com.project.mapstructlombok.service.UserService;

@RestController
public class UserController {
	
	UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/users")
	public List<UserDTO> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/users")
	public UserDTO addUser(@RequestBody UserDTO userDto) {
		return userService.saveUser(userDto);
	}
	
	@PutMapping("/users/{id}")
	public UserDTO updateUser(@PathVariable long id,@RequestBody UserDTO userDto) {
		return userService.updateUser(id,userDto);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable long id) {
		 userService.deleteUser(id);
	}
}
