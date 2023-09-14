package com.damian.employeemanager.endpoints;

import com.damian.employeemanager.dto.TechLead_DTO;
import com.damian.employeemanager.response.Response;
import com.damian.employeemanager.service.TechLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/techLead")
@CrossOrigin

public class TechLeadController {
    @Autowired
    private TechLeadService techLeadService;
    @PostMapping(path = "/save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Response save(@RequestBody TechLead_DTO techLead_dto){
        return techLeadService.save(techLead_dto);

    }


}
