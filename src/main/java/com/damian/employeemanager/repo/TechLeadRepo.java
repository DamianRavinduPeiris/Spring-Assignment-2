package com.damian.employeemanager.repo;

import com.damian.employeemanager.entity.TechLead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechLeadRepo extends JpaRepository<TechLead, String> {
}
