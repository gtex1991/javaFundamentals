package com.company.designprinciples.persistance;

import com.company.designprinciples.model.Employee;

public class EmployeeFileSerializer {

    public String serializer (Employee employee){
        StringBuilder sb = new StringBuilder();

        sb.append("### employee Record ###");
        sb.append(System.lineSeparator());

        sb.append("Name:");
        sb.append(employee.getFullName());
        sb.append(System.lineSeparator());

        sb.append("Position: ");
        sb.append(employee.getClass().getTypeName());
        sb.append(System.lineSeparator());

        sb.append("Email: ");
        sb.append(employee.getEmail());
        sb.append(System.lineSeparator());

        sb.append("Monthly Wage: ");
        sb.append(employee.getMonthlyIncome());
        sb.append(System.lineSeparator());

        return sb.toString();
    }
}
