package com.damian.employeemanager.repo;

import com.damian.employeemanager.entity.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Projects, String> {
}
