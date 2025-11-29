package com.ralastra.pm_api_spring.repository;

import com.ralastra.pm_api_spring.model.MemberRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRoleRepository extends JpaRepository<MemberRole, Integer> {
}
