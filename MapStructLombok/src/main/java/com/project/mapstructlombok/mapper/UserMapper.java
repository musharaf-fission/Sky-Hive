package com.project.mapstructlombok.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.project.mapstructlombok.dto.UserDTO;
import com.project.mapstructlombok.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	List<UserDTO> modelToDtoList(List<User> users);
	UserDTO modelToDto(User user);
	User dtoToModel(UserDTO userDto);
}
