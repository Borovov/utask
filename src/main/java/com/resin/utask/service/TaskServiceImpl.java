package com.resin.utask.service;

import com.resin.utask.dto.TaskDto;
import com.resin.utask.entity.TaskEntity;
import com.resin.utask.mapper.TaskMapper;
import com.resin.utask.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public Collection<TaskDto> findTasks(Collection<UUID> ids) {
        Collection<TaskEntity> entities = taskRepository.findByIdIn(ids);
        return TaskMapper.entityToDto(entities);
    }

    public Collection<TaskDto> addTasks(Collection<TaskDto> dtos) {
        Collection<TaskEntity> entities = taskRepository.saveAll(TaskMapper.dtoToEntity(dtos));
        return TaskMapper.entityToDto(entities);
    }

    public Collection<TaskDto> deleteTasks(Collection<TaskDto> dtos) {
        try {
            taskRepository.deleteAllById(dtos.stream().map(TaskDto::getId).collect(Collectors.toList()));
            return Collections.emptyList();
        } catch (EmptyResultDataAccessException ex) {
            ex.printStackTrace();
            // TODO return not found rows
            return dtos;
        }
    }

}
