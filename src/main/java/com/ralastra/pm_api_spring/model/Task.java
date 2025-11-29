package com.ralastra.pm_api_spring.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer id;

    @Column(name = "title", nullable = false)
    @JsonProperty("title")
    private String title;

    @Column(name = "description")
    @JsonProperty("description")
    private String description;

    @Column(name = "task_type")
    @JsonProperty("task_type")
    private String taskType;

    @Column(name = "status")
    @JsonProperty("status")
    private String status;

    @Column(name = "priority")
    @JsonProperty("priority")
    private String priority;

    @Column(name = "percentage_done")
    @JsonProperty("percentage_done")
    private Integer percentageDone;

    @Column(name = "start_date")
    @JsonProperty("start_date")
    private LocalDate startDate;

    @Column(name = "completion_date")
    @JsonProperty("completion_date")
    private LocalDate completionDate;

    @Column(name = "due_date", nullable = false)
    @JsonProperty("due_date")
    private LocalDate dueDate;

    //many to one
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_to")
    @JsonIgnore
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    @JsonIgnore
    private Project project;

    // Constructors
    public Task() {
    }

    public Task(String title, String description, String taskType, String status, Integer percentageDone,
                String priority, LocalDate startDate, LocalDate completionDate, LocalDate dueDate, User user, Project project) {
        this.title = title;
        this.description = description;
        this.taskType = taskType;
        this.status = status;
        this.percentageDone = percentageDone;
        this.priority = priority;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.dueDate = dueDate;
        this.user = user;
        this.project = project;
    }

    //getter and setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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


    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Integer getPercentageDone() {
        return percentageDone;
    }

    public void setPriority(Integer percentageDone) {
        this.percentageDone = percentageDone;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }


    // Helper methods for JSON output
    @JsonProperty("assigned_to")
    public Integer getUserId() {
        return user != null ? user.getId() : null;
    }

    @JsonProperty("project_id")
    public Integer getProjectId() {
        return project != null ? project.getId() : null;
    }
}
