package com.mindex.challenge.controller;

import com.mindex.challenge.data.ReportingStructure;
import java.util.List;

import com.mindex.challenge.service.ReportingStructureService;
import com.mindex.challenge.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReportingStructureController {
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureController.class);

    @Autowired
    private ReportingStructureService reportingStructureService;

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/reportingStructure/{id}")
    public ReportingStructure reportingStructure(@PathVariable String id) {
        LOG.debug("Received reporting structure read request for id [{}]", id);

        return reportingStructureService.reportingStructure(id);
    }
}
