package com.damian.employeemanager.service;

import com.damian.employeemanager.dto.Projects_DTO;
import com.damian.employeemanager.entity.Projects;

public class Convertor {
    public static Projects_DTO toProjectsDTO(Projects project){
        return new Projects_DTO(project.getProjectId(),project.getProjectName(),project.getProjectDescription(),project.getProjectDeadline(),project.getTechLeadId().getTechLeadId());

    }
}
