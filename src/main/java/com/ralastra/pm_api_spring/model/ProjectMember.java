package com.ralastra.pm_api_spring.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer id;

    @Column(name = "user_id", nullable = false)
    @JsonProperty("user_id")
    private Integer userId;

    @Column(name = "project_id", nullable = false)
    @JsonProperty("project_id")
    private Integer projectId;

    public ProjectMember(Integer userId, Integer projectId) {
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
