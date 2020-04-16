package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.CompensationRepository;
import java.util.List;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CompensationServiceImpl implements CompensationService {

    private static final Logger LOG = LoggerFactory.getLogger(CompensationServiceImpl.class);

    @Autowired
    private CompensationRepository compensationRepository;


    @Override
    public Compensation create(Compensation compensation) {
        LOG.debug("Creating compensation entry [{}]", compensation);

        compensation.getEmployee().setEmployeeId(UUID.randomUUID().toString());
        compensationRepository.insert(compensation);

        return compensation;
    }

    @Override
    public Compensation read(String id) {
        LOG.debug("Reading Compensation with id [{}]", id);

        List<Compensation> compensationList = compensationRepository.findAll();
        Compensation returnCompensation = null;
        for (Compensation compensation : compensationList)
        	if (compensation.getEmployee().getEmployeeId().equals(id))
        		returnCompensation = compensation;
        
        

        if (returnCompensation == null) {
            throw new RuntimeException("Compensation lookup:  Invalid employeeId: '" + id + "' passed.");
        }

        return returnCompensation;
    }
}
