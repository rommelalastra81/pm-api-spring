package com.ralastra.pm_api_spring.service;

import com.ralastra.pm_api_spring.dto.CreateTaskRequest;
import com.ralastra.pm_api_spring.dto.TaskDTO;

public interface TaskService {
    TaskDTO createTask(CreateTaskRequest request);
}
