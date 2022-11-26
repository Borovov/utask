package com.resin.utask.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "attempts", schema = "public")
public class AttemptsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "username")
    private String username;

    @Column(name = "attempts")
    private int attempts;
}
