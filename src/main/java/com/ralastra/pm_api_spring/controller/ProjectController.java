package com.ralastra.pm_api_spring.controller;

import com.ralastra.pm_api_spring.dto.ProjectDTO;
import com.ralastra.pm_api_spring.dto.UserDTO;
import com.ralastra.pm_api_spring.service.ProjectService;
import com.ralastra.pm_api_spring.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Project")
@CrossOrigin(origins = "*")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/getprojects")
    public ResponseEntity<List<ProjectDTO>> getProjects() {
        List<ProjectDTO> projects = projectService.getAllProjects();
        return ResponseEntity.ok(projects);
    }
}
