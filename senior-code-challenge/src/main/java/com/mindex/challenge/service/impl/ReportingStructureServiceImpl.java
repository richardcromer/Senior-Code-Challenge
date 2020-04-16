package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.EmployeeRepository;
import java.util.List;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.EmployeeService;

import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;

import java.util.UUID;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService {

    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired 
    private ApplicationContext applicationContext;

    @Override
    public ReportingStructure reportingStructure(String id)
    {
    	
    	ReportingStructure rs = applicationContext.getBean(ReportingStructure.class);
    	Employee employee = employeeRepository.findByEmployeeId(id);
    	rs.setEmployee(employee);
    	rs.setNumberOfReports(employeeCount(id));
    	
    	return rs;
    }
    

    /*
     * This method is used to compute an employee's reports, direct and indirect. It is recursive so it will work indefinitely. 
     *  This can be used for anything from the CEO down to an individual contributor.
     * CEO will return the number of employees in the company, while an individual contributor will return a 0.
     */
    private int employeeCount(String id) {
        LOG.debug("Computing the employee count of employee with id [{}]", id);
        int count = 0;
        Employee employee = employeeRepository.findByEmployeeId(id);
        if (employee.getDirectReports() != null)
        {
        for (Employee currentEmployee: employee.getDirectReports())
        	{
        		count++;
        		count+= employeeCount(currentEmployee.getEmployeeId());
        	}
        }

        return count;
    }
}
