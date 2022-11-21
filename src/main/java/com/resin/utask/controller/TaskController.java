package com.resin.utask.controller;

import com.resin.utask.dto.TaskDto;
import com.resin.utask.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping(path = "/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping("/ids")
    public Collection<TaskDto> findTasks(@RequestBody Collection<UUID> ids) {
        return taskService.findTasks(ids);
    }

    @PutMapping
    public Collection<TaskDto> addTasks(@RequestBody Collection<TaskDto> dtos) {
        return taskService.addTasks(dtos);
    }

    @DeleteMapping
    public ResponseEntity<Collection<TaskDto>> deleteTasks(@RequestBody Collection<TaskDto> dtos) {
        Collection<TaskDto> findDtos = taskService.deleteTasks(dtos);
        if (!findDtos.isEmpty()) {
            return ResponseEntity.internalServerError().body(findDtos);
        }
        return ResponseEntity.ok().body(findDtos);
    }

}
