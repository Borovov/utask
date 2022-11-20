package com.resin.utask.controller;

import com.resin.utask.dto.TaskDto;
import com.resin.utask.entity.TaskEntity;
import com.resin.utask.mapper.TaskMapper;
import com.resin.utask.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskRepository taskRepository;

    @PostMapping("/ids")
    public Collection<TaskEntity> findTasks(@RequestBody Collection<UUID> ids) {
        return taskRepository.findByIdIn(ids);
    }

    @PutMapping
    public Collection<TaskEntity> addTasks(@RequestBody Collection<TaskDto> tasks) {
        return taskRepository.saveAll(tasks.stream().map(TaskMapper::dtoToEntity).collect(Collectors.toList()));
    }

}
