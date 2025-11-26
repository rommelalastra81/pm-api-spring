package com.ralastra.pm_api_spring.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer id;
    
    @Column(name = "full_name", nullable = false)
    @JsonProperty("full_name")
    private String fullName;
    
    @Column(name = "email", nullable = false, unique = true)
    @JsonProperty("email")
    private String email;
    
    @Column(name = "password", nullable = false)
    @JsonProperty("password")
    private String password;
    
    @Column(name = "job_role")
    @JsonProperty("job_role")
    private String jobRole;
    
    // Constructors
    public User() {
    }
    
    public User(String fullName, String email, String password, String jobRole) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.jobRole = jobRole;
    }
    
    // Getters and Setters
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getJobRole() {
        return jobRole;
    }
    
    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
}
