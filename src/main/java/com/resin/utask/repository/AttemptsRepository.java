package com.resin.utask.repository;

import java.util.Optional;

import com.resin.utask.entity.AttemptsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttemptsRepository extends JpaRepository<AttemptsEntity, Integer> {
    Optional<AttemptsEntity> findAttemptsByUsername(String username);
}
