package com.damian.employeemanager.util;

import com.damian.employeemanager.dto.Projects_DTO;
import com.damian.employeemanager.entity.Projects;

public class CustomConvertor {
    public static Projects_DTO toProjectsDTO(Projects project){
        return new Projects_DTO(project.getProjectId(),project.getProjectName(),project.getProjectDescription(),project.getProjectDeadline(),project.getTechLeadId().getTechLeadId());

    }
}
