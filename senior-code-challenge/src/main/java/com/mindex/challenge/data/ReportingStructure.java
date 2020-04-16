package com.mindex.challenge.data;

import java.util.List;

import org.springframework.stereotype.Component;
import com.mindex.challenge.data.Employee;



@Component
public class ReportingStructure {
    private Employee employee;
    private int numberOfReports;

    public ReportingStructure() {
    }

    public Employee getEmployee()
    {
    	return employee;
    }
    
    public void setEmployee(Employee employee)
    {
    	this.employee = employee;
    }
    

    public int getNumberOfReports() {
    	
        return numberOfReports;
    }

    public void setNumberOfReports(int numberOfReports) {
    	
        this.numberOfReports = numberOfReports;
    }

}
