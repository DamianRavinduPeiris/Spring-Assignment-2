package com.damian.employeemanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.Super;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Projects_DTO implements Serializable, Super_DTO {
    private String projectId;
    private String projectName;
    private String projectDescription;
    private String projectDeadline;
    private String techLeadId;
}
