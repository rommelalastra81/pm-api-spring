package com.ralastra.pm_api_spring.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer id;

    @Column(name = "role", nullable = false)
    @JsonProperty("role")
    private String role;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<MemberRole> memberRoles = new ArrayList<>();

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<MemberRole> getMemberRoles() {
        return memberRoles;
    }

    public void setMemberRoles(List<MemberRole> memberRoles) {
        this.memberRoles = memberRoles;
    }
}
