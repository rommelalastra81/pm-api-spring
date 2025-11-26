package com.ralastra.pm_api_spring.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "member_roles")
public class MemberRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_member_id", nullable = false)
    @JsonIgnore
    private ProjectMember projectMember;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    @JsonIgnore
    private Role role;

    public MemberRole() {
    }

    public MemberRole(ProjectMember projectMember, Role role) {
        this.projectMember = projectMember;
        this.role = role;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProjectMember getProjectMember() {
        return projectMember;
    }

    public void setProjectMember(ProjectMember projectMember) {
        this.projectMember = projectMember;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    // Helper methods for JSON output
    @JsonProperty("project_member_id")
    public Integer getProjectMemberId() {
        return projectMember != null ? projectMember.getId() : null;
    }

    @JsonProperty("role_id")
    public Integer getRoleId() {
        return role != null ? role.getId() : null;
    }
}
