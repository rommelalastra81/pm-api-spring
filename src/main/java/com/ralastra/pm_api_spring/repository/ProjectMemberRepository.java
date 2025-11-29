package com.ralastra.pm_api_spring.repository;

import com.ralastra.pm_api_spring.model.ProjectMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectMemberRepository extends JpaRepository<ProjectMember, Integer> {
}
