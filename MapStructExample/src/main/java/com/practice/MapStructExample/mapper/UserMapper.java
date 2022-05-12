package com.practice.MapStructExample.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.practice.MapStructExample.dto.UserDTO;
import com.practice.MapStructExample.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	List<UserDTO> modelToDtoList(List<User> users);
	UserDTO modelToDto(User user);
	User dtoToModel(UserDTO userDto);
}
