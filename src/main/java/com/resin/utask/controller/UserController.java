package com.resin.utask.controller;

import com.resin.utask.dto.UserDto;
import com.resin.utask.entity.UserEntity;
import com.resin.utask.mapper.UserMapper;
import com.resin.utask.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public UserDto userRegistration(@RequestBody UserDto dto) {
        UserEntity entity;
        try {
            entity = userService.register(dto);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        return UserMapper.entityToDto(entity);
    }
}
