package com.company.designprinciples.persistance;

import com.company.designprinciples.model.Employee;
import com.company.designprinciples.persistance.EmployeeFileSerializer;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    private EmployeeFileSerializer serializer;

    public EmployeeRepository(EmployeeFileSerializer serializer){
        this.serializer =serializer;
    }

    public List<Employee> findAll(){
        Employee billy = new Employee("Billy Reech", 920);
        Employee sally = new Employee("Sally Reech", 9210);
        Employee jill = new Employee("Jill Reech", 2020);

        return Arrays.asList(billy,sally,jill);
    }

    public void save(Employee employee)throws IOException{
        String serializedString = this.serializer.serializer(employee);
        Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
        Files.write(path, serializedString.getBytes());
    }




}
