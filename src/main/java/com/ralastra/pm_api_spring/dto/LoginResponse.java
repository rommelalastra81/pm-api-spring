package com.ralastra.pm_api_spring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {
    @JsonProperty("token")
    private String token;
    
    @JsonProperty("type")
    private String type = "Bearer";
    
    @JsonProperty("user_id")
    private Integer userId;
    
    @JsonProperty("email")
    private String email;
    
    @JsonProperty("full_name")
    private String fullName;
    
    // Constructors
    public LoginResponse() {
    }
    
    public LoginResponse(String token, Integer userId, String email, String fullName) {
        this.token = token;
        this.userId = userId;
        this.email = email;
        this.fullName = fullName;
    }
    
    // Getters and Setters
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public Integer getUserId() {
        return userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
