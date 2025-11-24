package com.ralastra.pm_api_spring.dto;

public class CreateUserRequest {
    private String fullName;
    private String email;
    private String password;
    private String jobRole;
    
    // Constructors
    public CreateUserRequest() {
    }
    
    public CreateUserRequest(String fullName, String email, String password, String jobRole) {
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
