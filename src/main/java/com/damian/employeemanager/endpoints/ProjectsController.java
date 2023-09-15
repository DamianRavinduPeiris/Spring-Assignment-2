package com.damian.employeemanager.endpoints;

import com.damian.employeemanager.dto.Projects_DTO;
import com.damian.employeemanager.response.Response;
import com.damian.employeemanager.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projects")
@CrossOrigin
public class ProjectsController {
    @Autowired
    private ProjectService projectsService;

    @PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response save(@RequestBody Projects_DTO projectsDto) {
        return projectsService.save(projectsDto);

    }

    @PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response update(@RequestBody Projects_DTO projectsDto) {
        return projectsService.update(projectsDto);
    }
    /*@GetMapping(path = "/search",params="/projectId",produces = MediaType.APPLICATION_JSON_VALUE)*/

}


