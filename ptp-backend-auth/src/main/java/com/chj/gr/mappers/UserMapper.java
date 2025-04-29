package com.chj.gr.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.chj.gr.dto.UserDto;
import com.chj.gr.entities.AuthUser;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "user.id", target = "id")
    @Mapping(source = "user.login", target = "login")
    @Mapping(source = "token", target = "token")
    @Mapping(target = "password", ignore = true)
    UserDto toUserDto(AuthUser user, String token);

    @Mapping(source = "encodedPassword", target = "password")
    AuthUser toAuthUser(UserDto userDto, String encodedPassword);
}
