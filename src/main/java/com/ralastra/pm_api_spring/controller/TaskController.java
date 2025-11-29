package com.ralastra.pm_api_spring.controller;

import com.ralastra.pm_api_spring.dto.CreateTaskRequest;
import com.ralastra.pm_api_spring.dto.TaskDTO;
import com.ralastra.pm_api_spring.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Task")
@CrossOrigin(origins = "*")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/createtask")
    public ResponseEntity<TaskDTO> createTask(@RequestBody CreateTaskRequest request) {
        TaskDTO createdTask = taskService.createTask(request);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }


}
