package com.damian.employeemanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class TechLead {
    @Id
    private String techLeadId;
    private String techLeadName;
    private String techLeadEmail;
    private String techLeadAddress;
    @OneToMany(mappedBy = "techLeadId" ,targetEntity = Projects.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Projects>projectsList = new ArrayList<>();

}
