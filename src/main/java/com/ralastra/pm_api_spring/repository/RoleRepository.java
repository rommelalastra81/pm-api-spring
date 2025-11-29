package com.ralastra.pm_api_spring.repository;

import com.ralastra.pm_api_spring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
