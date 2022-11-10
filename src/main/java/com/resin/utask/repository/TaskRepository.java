package com.resin.utask.repository;

import com.resin.utask.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, UUID> {

    Collection<TaskEntity> findByIdIn(Collection<UUID> ids);
}
