package com.ralastra.pm_api_spring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class TaskDTO {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("task_type")
    private String taskType;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("status")
    private String status;

    @JsonProperty("percentage_done")
    private Integer percentageDone;

    @JsonProperty("assigned_to")
    private Integer assignedTo;

    @JsonProperty("project_id")
    private Integer projectId;

    @JsonProperty("start_date")
    private LocalDate startDate;

    @JsonProperty("completion_date")
    private LocalDate completionDate;

    @JsonProperty("due_date")
    private LocalDate dueDate;

    // Constructors
    public TaskDTO(Integer id, String title, String description, String status, String taskType, String priority,
                   Integer percentageDone, Integer assignedTo, Integer projectId, LocalDate startDate, LocalDate completionDate,
                    LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.taskType = taskType;
        this.priority = priority;
        this.percentageDone = percentageDone;
        this.assignedTo = assignedTo;
        this.projectId = projectId;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.dueDate = dueDate;

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

    public void setPercentageDone(Integer percentageDone) {
        this.percentageDone = percentageDone;
    }


    public Integer getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Integer assignedTo) {
        this.assignedTo = assignedTo;
    }


    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
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
}
