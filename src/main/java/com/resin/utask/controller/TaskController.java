package com.resin.utask.controller;

import com.resin.utask.entity.TaskEntity;
import com.resin.utask.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskRepository taskRepository;

    @GetMapping()
    public Collection<TaskEntity> getTasks() {
        return taskRepository.findAll();
    }

}
