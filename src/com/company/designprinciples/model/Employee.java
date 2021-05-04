package com.company.designprinciples.model;

public class Employee {
    private String firstName;
    private String lastName;
    private int monthlyIncome;
    private int nbHoursPerWeek;
    private String email;



    public Employee(String firstName, String lastName, int monthlyIncome, int nbHoursPerWeek, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlyIncome = monthlyIncome;
        this.nbHoursPerWeek = nbHoursPerWeek;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(String firstName, int monthlyIncome) {
        this.firstName = firstName;
        this.monthlyIncome = monthlyIncome;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getNbHoursPerWeek() {
        return nbHoursPerWeek;
    }

    public void setNbHoursPerWeek(int nbHoursPerWeek) {
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public String getFullName(){
        return this.firstName+ " " + this.lastName;
    }

    public FullTimeEmployee fullTimeEmployee(String fullName, int income){
       String fullname =  getFullName();
        int monthlyIncome = getMonthlyIncome();

        return fullTimeEmployee(fullName,monthlyIncome );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", nbHoursPerWeek=" + nbHoursPerWeek +
                '}';
    }
}
