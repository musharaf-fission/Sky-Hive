package com.project.mapstructlombok.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.mapstructlombok.dto.UserDTO;
import com.project.mapstructlombok.mapper.UserMapper;
import com.project.mapstructlombok.model.User;
import com.project.mapstructlombok.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepo;
	
	private UserMapper userMapper;
	
	@Autowired
	public UserService(UserRepository userRepo, UserMapper userMapper) {
		super();
		this.userRepo = userRepo;
		this.userMapper = userMapper;
	}



	public List<UserDTO> getAllUsers(){
		return userMapper.modelToDtoList(userRepo.findAll());
	}
	
	public UserDTO saveUser(UserDTO userDto) {
		return userMapper.modelToDto(userRepo.save(userMapper.dtoToModel(userDto)));
	}
	
	public UserDTO updateUser(long id,UserDTO userDto) {
		User user=userRepo.findById(id).orElse(null);
		user.setName(userDto.getName());
		user.setAddress(userDto.getAddress());
		user.setAge(userDto.getAge());
		return userMapper.modelToDto(userRepo.save(user));
	}
	
	
	public void deleteUser(long id) {
		userRepo.deleteById(id);
	}
}
