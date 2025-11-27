package com.ralastra.pm_api_spring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class ProjectDTO {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("status")
    private String status;

    @JsonProperty("start_date")
    private LocalDate startDate;

    @JsonProperty("target_completion")
    private LocalDate targetCompletion;

    // Constructors
    public ProjectDTO(Integer id, String name, String description, String status, LocalDate startDate, LocalDate targetCompletion) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.startDate = startDate;
        this.targetCompletion = targetCompletion;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getTargetCompletion() {
        return targetCompletion;
    }

    public void setTargetCompletion(LocalDate targetCompletion) {
        this.targetCompletion = targetCompletion;
    }
}
