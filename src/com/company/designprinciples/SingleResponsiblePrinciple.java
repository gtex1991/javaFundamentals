package com.company.designprinciples;

import com.company.designprinciples.logging.ConsoleLogger;
import com.company.designprinciples.model.Employee;
import com.company.designprinciples.persistance.EmployeeFileSerializer;
import com.company.designprinciples.persistance.EmployeeRepository;

import java.io.IOException;
import java.util.List;

public class SingleResponsiblePrinciple {

    public static  void main (String[] args){

        ConsoleLogger consoleLogger = new ConsoleLogger();

        // Grab employees
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        List<Employee> employees = repository.findAll();

        //Save all
        for(Employee e: employees){
            try {
                repository.save(e);
                consoleLogger.writeInfo("Saved Employee", e.toString());
            } catch (IOException exception){
                consoleLogger.writError("Error Saving employee", exception);
            }
        }
    }
}
