package com.ralastra.pm_api_spring.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "projects")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "password")
    private String status;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "target_completion", nullable = false)
    private LocalDate  targetCompletion;

    public Projects(String name, String description, String status, LocalDate startDate, LocalDate targetCompletion) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.startDate = startDate;
        this.targetCompletion = targetCompletion;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void setJobRole(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getTargetCompletion() {
        return targetCompletion;
    }

    public void setTargetCompletion(LocalDate targetCompletion) {
        this.targetCompletion = targetCompletion;
    }

}
