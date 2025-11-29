package com.ralastra.pm_api_spring.service;

import com.ralastra.pm_api_spring.dto.ProjectMemberDTO;
import com.ralastra.pm_api_spring.dto.AddProjectMemberRequest;
import java.util.List;

public interface ProjectMemberService {
    List<ProjectMemberDTO> addProjectMembers(Integer projectId, List<AddProjectMemberRequest> requests);
}
