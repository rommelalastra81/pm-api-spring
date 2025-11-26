package com.ralastra.pm_api_spring.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MemberRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer id;

    @Column(name = "project_member_id", nullable = false)
    @JsonProperty("project_member_id")
    private Integer projectMemberId;

    @Column(name = "role_id", nullable = false)
    @JsonProperty("role_id")
    private Integer roleId;

    public MemberRole(Integer projectMemberId, Integer roleId) {
        this.projectMemberId = projectMemberId;
        this.roleId = roleId;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectMemberId() {
        return projectMemberId;
    }

    public void setProjectMemberId(Integer projectMemberId) {
        this.projectMemberId = projectMemberId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
