package com.ralastra.pm_api_spring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {
    @JsonProperty("id")
    private Long id;
    
    @JsonProperty("full_name")
    private String fullName;
    
    @JsonProperty("email")
    private String email;
    
    @JsonProperty("job_role")
    private String jobRole;
    
    // Constructors
    public UserDTO() {
    }
    
    public UserDTO(Long id, String fullName, String email, String jobRole) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.jobRole = jobRole;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
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
    
    public String getJobRole() {
        return jobRole;
    }
    
    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
}
