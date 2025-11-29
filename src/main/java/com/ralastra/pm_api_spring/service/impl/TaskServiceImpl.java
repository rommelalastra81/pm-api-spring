package com.ralastra.pm_api_spring.service.impl;

import com.ralastra.pm_api_spring.dto.CreateTaskRequest;
import com.ralastra.pm_api_spring.dto.ProjectDTO;
import com.ralastra.pm_api_spring.dto.TaskDTO;
import com.ralastra.pm_api_spring.model.Project;
import com.ralastra.pm_api_spring.model.Task;
import com.ralastra.pm_api_spring.model.User;
import com.ralastra.pm_api_spring.repository.TaskRepository;
import com.ralastra.pm_api_spring.repository.UserRepository;
import com.ralastra.pm_api_spring.repository.ProjectRepository;
import com.ralastra.pm_api_spring.service.TaskService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;

    public TaskServiceImpl(TaskRepository taskRepository, UserRepository userRepository, ProjectRepository projectRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public TaskDTO createTask(CreateTaskRequest request) {
        Task task = new Task();
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setTaskType(request.getTaskType());
        
        // Set the Project entity (required, not nullable)
        Project project = projectRepository.findById(request.getProjectId())
                .orElseThrow(() -> new RuntimeException("Project not found with id: " + request.getProjectId()));
        task.setProject(project);
        
        // Set the User entity (optional - assigned_to can be null)
        if (request.getAssignedTo() != null) {
            User user = userRepository.findById(request.getAssignedTo())
                    .orElseThrow(() -> new RuntimeException("User not found with id: " + request.getAssignedTo()));
            task.setUser(user);
        }
        
        task.setStatus(request.getStatus());
        task.setPriority(request.getPriority());
        task.setStartDate(request.getStartDate());
        task.setCompletionDate(request.getCompletionDate());
        task.setDueDate(request.getDueDate());

        Task savedTask = taskRepository.save(task);
        return convertToDTO(savedTask);
    }

    private TaskDTO convertToDTO(Task task) {
        return new TaskDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus(),
                task.getTaskType(),
                task.getPriority(),
                task.getPercentageDone(),
                task.getAssignedTo(),
                task.getProjectId(),
                task.getStartDate(),
                task.getCompletionDate(),
                task.getDueDate()
        );
    }
}
