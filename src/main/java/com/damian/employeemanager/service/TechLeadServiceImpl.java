package com.damian.employeemanager.service;

import com.damian.employeemanager.dto.TechLead_DTO;
import com.damian.employeemanager.response.Response;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TechLeadServiceImpl implements TechLeadService {
    @Override
    public Response save(TechLead_DTO techLeadDto) {
        return null;
    }

    @Override
    public Response update(TechLead_DTO techLeadDto) {
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
