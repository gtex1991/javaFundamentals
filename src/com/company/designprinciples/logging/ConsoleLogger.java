package com.company.designprinciples.logging;

public class ConsoleLogger {

    public void writeInfo(String saved_employee, String msg){
        System.out.print(("Info: " + msg));
    }

    public void writError(String msg, Exception e){
        System.err.println("Error: " + msg + ";" + e);
    }
}
