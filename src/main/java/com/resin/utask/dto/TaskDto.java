package com.resin.utask.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
public class TaskDto {

    private UUID id;

    private String name;

    private String description;

    private UUID creatorId;

    private UUID executorId;
}
