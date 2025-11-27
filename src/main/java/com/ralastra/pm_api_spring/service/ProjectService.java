package com.ralastra.pm_api_spring.service;

import com.ralastra.pm_api_spring.dto.ProjectDTO;
import java.util.List;

public interface ProjectService {

    List<ProjectDTO> getAllProjects();

}
