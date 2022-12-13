package com.resin.utask.service;

import com.resin.utask.dto.UserDto;
import com.resin.utask.entity.UserEntity;
import com.resin.utask.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public UserEntity register(UserDto dto) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(dto, userEntity);
        encodePassword(userEntity, dto);
        return userRepository.save(userEntity);
    }

    private void encodePassword(UserEntity userEntity, UserDto dto) {
        userEntity.setPassword(passwordEncoder.encode(dto.getPassword()));
    }
}
