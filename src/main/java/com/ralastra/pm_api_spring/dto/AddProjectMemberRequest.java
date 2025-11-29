package com.ralastra.pm_api_spring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddProjectMemberRequest {



    @JsonProperty("user_id")
    private Integer userId;

    @JsonProperty("project_id")
    private Integer projectId;

    @JsonProperty("role_id")
    private Integer roleId;

    // Constructors
    public AddProjectMemberRequest() {
    }

    public AddProjectMemberRequest(Integer userId, Integer projectId, Integer roleId) {
        this.userId = userId;
        this.projectId = projectId;
        this.roleId = roleId;
    }

    // Getters and Setters
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}
