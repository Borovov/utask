package com.resin.utask.repository;

import java.util.Optional;

import com.resin.utask.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    Optional<UserEntity> findUserByUsername(String username);
}