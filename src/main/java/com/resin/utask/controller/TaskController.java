package com.resin.utask.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/task")
public class TaskController {

    @GetMapping()
    public String getTasks() {
        return "Here your tasks";
    }

}
