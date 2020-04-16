package com.mindex.challenge.service;

import com.mindex.challenge.data.ReportingStructure;
import java.util.List;


public interface ReportingStructureService {
    ReportingStructure reportingStructure(String id);
}




/*
 * Richard just put this here to track the id's (basically to have one less file open in my IDE)
  {
    "employeeId" : "16a596ae-edd3-4847-99fe-c4518e82c86f",
    "firstName" : "John",
    "lastName" : "Lennon",
    "position" : "Development Manager",
    "department" : "Engineering",
    "directReports" : [
      {
        "employeeId" : "b7839309-3348-463b-a7e3-5de1c168beb3"
      },
      {
        "employeeId": "03aa1462-ffa9-4978-901b-7c001562cf6f"
      }
    ]
  },
  {
    "employeeId" : "b7839309-3348-463b-a7e3-5de1c168beb3",
    "firstName" : "Paul",
    "lastName" : "McCartney",
    "position" : "Developer I",
    "department" : "Engineering"
  },
  {
    "employeeId" : "03aa1462-ffa9-4978-901b-7c001562cf6f",
    "firstName" : "Ringo",
    "lastName" : "Starr",
    "position" : "Developer V",
    "department" : "Engineering",
    "directReports" : [
      {
        "employeeId" : "62c1084e-6e34-4630-93fd-9153afb65309"
      },
      {
        "employeeId": "c0c2293d-16bd-4603-8e08-638a9d18b22c"
      }
    ]
  },
  {
    "employeeId" : "62c1084e-6e34-4630-93fd-9153afb65309",
    "firstName" : "Pete",
    "lastName" : "Best",
    "position" : "Developer II",
    "department" : "Engineering"
  },
  {
    "employeeId" : "c0c2293d-16bd-4603-8e08-638a9d18b22c",
    "firstName" : "George",
    "lastName" : "Harrison",
    "position" : "Developer III",
    "department" : "Engineering"
  }

 * 
 * 
 * 
 */
