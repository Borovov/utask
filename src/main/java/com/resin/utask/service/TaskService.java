package com.resin.utask.service;

import com.resin.utask.dto.TaskDto;

import java.util.Collection;
import java.util.UUID;

public interface TaskService {

    Collection<TaskDto> findTasks(Collection<UUID> ids);

    Collection<TaskDto> addTasks(Collection<TaskDto> dtos);

    Collection<TaskDto> deleteTasks(Collection<TaskDto> ids);

}
