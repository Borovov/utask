package com.resin.utask.mapper;

import com.resin.utask.dto.TaskDto;
import com.resin.utask.entity.TaskEntity;

public final class TaskMapper {

    public static TaskEntity dtoToEntity(TaskDto dto) {
        return TaskEntity.builder()
                .creatorId(dto.getCreatorId())
                .name(dto.getName())
                .description(dto.getDescription())
                .creatorId(dto.getCreatorId())
                .executorId(dto.getExecutorId())
                .build();
    }

}
