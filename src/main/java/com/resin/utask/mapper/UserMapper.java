package com.resin.utask.mapper;

import com.resin.utask.dto.UserDto;
import com.resin.utask.entity.UserEntity;

public final class UserMapper {

    public static UserEntity dtoTOEntity(UserDto dto) {
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

}
