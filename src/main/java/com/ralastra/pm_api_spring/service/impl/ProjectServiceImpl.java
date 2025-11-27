package com.ralastra.pm_api_spring.service.impl;

import com.ralastra.pm_api_spring.dto.ProjectDTO;
import com.ralastra.pm_api_spring.model.Project;
import com.ralastra.pm_api_spring.repository.ProjectRepository;
import com.ralastra.pm_api_spring.service.ProjectService;
import com.ralastra.pm_api_spring.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService  {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;

    }

    @Override
    @Transactional(readOnly = true)
    public List<ProjectDTO> getAllProjects() {
        return projectRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ProjectDTO convertToDTO(Project project) {
        return new ProjectDTO(
                project.getId(),
                project.getName(),
                project.getDescription(),
                project.getStatus(),
                project.getStartDate(),
                project.getTargetCompletion()
        );
    }
}
