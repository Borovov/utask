package com.resin.utask.entity;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Builder
@Entity
@Table(name = "task", schema = "public")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "creator_id")
    private UUID creatorId;

    @Column(name = "executor_id")
    private UUID executorId;
}
