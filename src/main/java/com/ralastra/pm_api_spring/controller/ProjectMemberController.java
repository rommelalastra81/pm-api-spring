package com.ralastra.pm_api_spring.controller;

import com.ralastra.pm_api_spring.dto.AddProjectMemberRequest;
import com.ralastra.pm_api_spring.dto.ProjectMemberDTO;
import com.ralastra.pm_api_spring.service.ProjectMemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ProjectMember")
@CrossOrigin(origins = "*")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;

    public ProjectMemberController(ProjectMemberService projectMemberService) {
        this.projectMemberService = projectMemberService;
    }

    @PostMapping("/addprojectmembers/{project_id}")
    public ResponseEntity<List<ProjectMemberDTO>> addProjectMembers(
            @PathVariable("project_id") Integer projectId,
            @RequestBody List<AddProjectMemberRequest> requests) {
        
        List<ProjectMemberDTO> addedMembers = projectMemberService.addProjectMembers(projectId, requests);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedMembers);
    }
}
