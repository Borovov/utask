package com.resin.utask.service;

import com.resin.utask.dto.UserDto;
import com.resin.utask.entity.UserEntity;

public interface UserService {

    UserEntity register(UserDto dto);

}
