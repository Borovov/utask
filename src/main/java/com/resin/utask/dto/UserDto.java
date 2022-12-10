package com.resin.utask.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UserDto implements Serializable {

    private String username;

    private String password;
}
