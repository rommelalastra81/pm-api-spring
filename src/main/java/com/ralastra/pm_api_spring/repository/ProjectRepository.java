package com.ralastra.pm_api_spring.repository;

import com.ralastra.pm_api_spring.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findByStatus(String status);
    Optional<Project> findByName(String name);
}
