package com.ralastra.pm_api_spring.service.impl;

import com.ralastra.pm_api_spring.dto.AddProjectMemberRequest;
import com.ralastra.pm_api_spring.dto.ProjectMemberDTO;
import com.ralastra.pm_api_spring.model.MemberRole;
import com.ralastra.pm_api_spring.model.Project;
import com.ralastra.pm_api_spring.model.ProjectMember;
import com.ralastra.pm_api_spring.model.Role;
import com.ralastra.pm_api_spring.model.User;
import com.ralastra.pm_api_spring.repository.ProjectMemberRepository;
import com.ralastra.pm_api_spring.repository.ProjectRepository;
import com.ralastra.pm_api_spring.repository.RoleRepository;
import com.ralastra.pm_api_spring.repository.UserRepository;
import com.ralastra.pm_api_spring.service.ProjectMemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProjectMemberServiceImpl implements ProjectMemberService {

    private final ProjectMemberRepository projectMemberRepository;
    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;
    private final RoleRepository roleRepository;

    public ProjectMemberServiceImpl(ProjectMemberRepository projectMemberRepository,
                                   UserRepository userRepository,
                                   ProjectRepository projectRepository,
                                   RoleRepository roleRepository) {
        this.projectMemberRepository = projectMemberRepository;
        this.userRepository = userRepository;
        this.projectRepository = projectRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public List<ProjectMemberDTO> addProjectMembers(Integer projectId, List<AddProjectMemberRequest> requests) {
        // Fetch the Project entity once (required, not nullable)
        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found with id: " + projectId));

        List<ProjectMember> projectMembers = new ArrayList<>();

        // Loop through each request and create ProjectMember entities
        for (AddProjectMemberRequest request : requests) {
            // Fetch the User entity (required, not nullable)
            User user = userRepository.findById(request.getUserId())
                    .orElseThrow(() -> new RuntimeException("User not found with id: " + request.getUserId()));

            // Create ProjectMember entity
            ProjectMember projectMember = new ProjectMember();
            projectMember.setUser(user);
            projectMember.setProject(project);

            // Handle Role if provided
            if (request.getRoleId() != null) {
                Role role = roleRepository.findById(request.getRoleId())
                        .orElseThrow(() -> new RuntimeException("Role not found with id: " + request.getRoleId()));
                
                MemberRole memberRole = new MemberRole();
                memberRole.setRole(role);
                memberRole.setProjectMember(projectMember);
                
                projectMember.getMemberRoles().add(memberRole);
            }

            // Add to the list
            projectMembers.add(projectMember);
        }

        // Save all project members in batch
        List<ProjectMember> savedMembers = projectMemberRepository.saveAll(projectMembers);

        // Convert to DTOs and return
        return savedMembers.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ProjectMemberDTO convertToDTO(ProjectMember projectMember) {
        return new ProjectMemberDTO(
                projectMember.getId(),
                projectMember.getUserId(),
                projectMember.getProjectId()
        );
    }
}
