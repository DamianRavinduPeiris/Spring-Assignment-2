package com.damian.employeemanager.service;

import com.damian.employeemanager.dto.Projects_DTO;
import com.damian.employeemanager.entity.Projects;
import com.damian.employeemanager.entity.TechLead;
import com.damian.employeemanager.repo.ProjectRepo;
import com.damian.employeemanager.repo.TechLeadRepo;
import com.damian.employeemanager.response.Response;
import com.damian.employeemanager.util.CustomConvertor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private Response response;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private TechLeadRepo techLeadRepo;
    @Autowired
    private ProjectRepo projectRepo;


    @Override
    public Response save(Projects_DTO projectsDto) {
        if (search(projectsDto.getProjectId()).getData() == null) {
            Optional<TechLead> techLead = techLeadRepo.findById(projectsDto.getTechLeadId());


            if (techLead.isPresent()) {
                Projects projects = mapper.map(projectsDto, Projects.class);
                projects.setTechLeadId(techLead.get());
                projectRepo.save(projects);
                return createAndSendResponse(HttpStatus.OK.value(), "Project successfully saved!", null);
            } else {
                throw new RuntimeException("TechLead does not exists!");
            }


        }
        throw new RuntimeException("Project already exists!");
    }

    @Override
    public Response update(Projects_DTO projectsDto) {
        if (search(projectsDto.getProjectId()).getData() != null) {
            Optional<TechLead> techLead = techLeadRepo.findById(projectsDto.getTechLeadId());
            if (techLead.isPresent()) {
                Projects projects = mapper.map(projectsDto, Projects.class);
                projects.setTechLeadId(techLead.get());
                projectRepo.save(projects);
                return createAndSendResponse(HttpStatus.OK.value(), "Successfully updated the project!", null);

            } else {
                throw new RuntimeException("TechLead does not exists!");
            }

        } return createAndSendResponse(HttpStatus.NOT_FOUND.value(), "Project does not exists", null);
    }

    @Override
    public Response delete(String s) {
        if(search(s).getData()!=null){
            projectRepo.deleteById(s);
            return createAndSendResponse(HttpStatus.OK.value(),"Successfully deleted the project",null);

        }
        throw new RuntimeException("Project does not exists!");


    }

    @Override
    public Response search(String s) {
        Optional<Projects> project = projectRepo.findById(s);
        if (project.isPresent()) {

            return createAndSendResponse(HttpStatus.FOUND.value(), "Project successfully retrieved!", CustomConvertor.toProjectsDTO(project.get()));

        }
        return createAndSendResponse(HttpStatus.NOT_FOUND.value(), "Project not found!", null);
    }

    @Override
    public Response getAll() {
        List<Projects> projects = projectRepo.findAll();
        if(!projects.isEmpty()){
            List<Projects_DTO>projectsDtos = new ArrayList<>();
            projects.forEach((project)->{
            projectsDtos.add(CustomConvertor.toProjectsDTO(project));
            });
            return createAndSendResponse(HttpStatus.FOUND.value(),"Projects successfully retrieved!",projectsDtos );



        }
        throw new RuntimeException("No projects were found in the DB!");


    }

    @Override
    public Response createAndSendResponse(int statusCode, String message, Object data) {
        response.setStatusCode(statusCode);
        response.setMessage(message);
        response.setData(data);
        return response;
    }
}
