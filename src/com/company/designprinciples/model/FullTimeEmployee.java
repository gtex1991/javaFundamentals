package com.company.designprinciples.model;

public class FullTimeEmployee {

    public Employee fullTimeEmployee(String fullName, int salary){

        Employee newEmployee = new Employee(fullName,salary);

        return newEmployee;
    }
}
