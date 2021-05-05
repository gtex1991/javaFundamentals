//package com.company.openClosedPrinciple.taxes;
//
//import com.company.designprinciples.model.Employee;
//import com.company.designprinciples.model.FullTimeEmployee;
//import com.company.designprinciples.model.InternalEmployee;
//import com.company.designprinciples.model.PartTimeEmployee;
//
//public class TaxCalculatorFactory {
//    public static TaxCalculator create (Employee employee){
//        if(employee instanceof Employee){
//            return new FullTimeTaxCalculator();
//        }
//
//        if(employee instanceof PartTimeEmployee){
//            return new FullTimeTaxCalculator();
//        }
//
//        if(employee instanceof InternalEmployee){
//            return new FullTimeTaxCalculator();
//        }
//
//    }
//}
