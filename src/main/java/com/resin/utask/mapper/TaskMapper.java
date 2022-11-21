package com.resin.utask.mapper;

import com.resin.utask.dto.TaskDto;
import com.resin.utask.entity.TaskEntity;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.stream.Collectors;

public final class TaskMapper {

    public static TaskEntity dtoToEntity(TaskDto dto) {
        return TaskEntity.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription())
                .creatorId(dto.getCreatorId())
                .executorId(dto.getExecutorId())
                .build();
    }

    public static Collection<TaskEntity> dtoToEntity(Collection<TaskDto> dtos) {
        return dtos.stream().map(TaskMapper::dtoToEntity).collect(Collectors.toList());
    }

    public static TaskDto entityToDto(TaskEntity entity) {
        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .creatorId(entity.getCreatorId())
                .executorId(entity.getExecutorId())
                .build();
    }

    public static Collection<TaskDto> entityToDto(Collection<TaskEntity> entities) {
        return entities.stream().map(TaskMapper::entityToDto).collect(Collectors.toList());
    }

}
