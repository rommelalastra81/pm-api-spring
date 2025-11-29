package com.ralastra.pm_api_spring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class ProjectMemberDTO {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("user_id")
    private Integer userId;

    @JsonProperty("project_id")
    private Integer projectId;

    // Constructors
    public ProjectMemberDTO(Integer id, Integer userId, Integer projectId) {
        this.id = id;
        this.userId = userId;
        this.projectId = projectId;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }


}
