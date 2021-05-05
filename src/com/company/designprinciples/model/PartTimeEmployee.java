package com.company.designprinciples.model;

public class PartTimeEmployee {
    private String fullName;
    private int salary;

    public PartTimeEmployee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
