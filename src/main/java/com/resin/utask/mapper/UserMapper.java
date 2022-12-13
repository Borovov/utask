package com.resin.utask.mapper;

import com.resin.utask.dto.UserDetailsDto;
import com.resin.utask.dto.UserDto;
import com.resin.utask.entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;

public final class UserMapper {

    public static UserEntity dtoToEntity(UserDto dto) {
        return UserEntity.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .build();
    }

    public static UserDto entityToDto(UserEntity entity) {
        return UserDto.builder()
                .username(entity.getUsername())
                .password(entity.getPassword())
                .build();
    }

    public static UserDetails entityToUserDetails(UserEntity entity) {
        return UserDetailsDto.builder()
                .username(entity.getUsername())
                .password(entity.getPassword())
                .build();
    }

}
