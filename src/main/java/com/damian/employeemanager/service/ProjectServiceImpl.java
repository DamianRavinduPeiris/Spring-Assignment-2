package com.damian.employeemanager.service;

import com.damian.employeemanager.dto.Projects_DTO;
import com.damian.employeemanager.response.Response;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService{
    @Override
    public Response save(Projects_DTO projectsDto) {
        return null;
    }

    @Override
    public Response update(Projects_DTO projectsDto) {
        return null;
    }

    @Override
    public Response delete(String s) {
        return null;
    }

    @Override
    public Response search(String s) {
        return null;
    }

    @Override
    public Response getAll() {
        return null;
    }

    @Override
    public Response createAndSendResponse(int statusCode, String message, Object data) {
        return null;
    }
}
