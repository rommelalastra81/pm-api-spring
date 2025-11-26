package com.ralastra.pm_api_spring.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "project_members")
public class ProjectMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    @JsonIgnore
    private Project project;

    @OneToMany(mappedBy = "projectMember", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<MemberRole> memberRoles = new ArrayList<>();

    public ProjectMember() {
    }

    public ProjectMember(User user, Project project) {
        this.user = user;
        this.project = project;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<MemberRole> getMemberRoles() {
        return memberRoles;
    }

    public void setMemberRoles(List<MemberRole> memberRoles) {
        this.memberRoles = memberRoles;
    }

    // Helper methods for JSON output
    @JsonProperty("user_id")
    public Integer getUserId() {
        return user != null ? user.getId() : null;
    }

    @JsonProperty("project_id")
    public Integer getProjectId() {
        return project != null ? project.getId() : null;
    }
}
