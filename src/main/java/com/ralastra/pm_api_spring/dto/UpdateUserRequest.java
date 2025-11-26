package com.ralastra.pm_api_spring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateUserRequest {
    @JsonProperty("full_name")
    private String fullName;
    
    @JsonProperty("email")
    private String email;
    
    @JsonProperty("password")
    private String password;
    
    @JsonProperty("job_role")
    private String jobRole;
    
    // Constructors
    public UpdateUserRequest() {
    }
    
    public UpdateUserRequest(String fullName, String email, String password, String jobRole) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.jobRole = jobRole;
    }
    
    // Getters and Setters
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
