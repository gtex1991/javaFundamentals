package com.company.openClosedPrinciple.taxes;

import com.company.designprinciples.model.Employee;

public class InternalTaxCalculator implements TaxCalculator{

    private final int INCOME_TAX_PERCENTAGE = 16;

    @Override
    public double calculate(Employee employee) {
        int monthlyIncome =employee.getMonthlyIncome();
        if(monthlyIncome < 350){
            return 0;
        } else {
        return (monthlyIncome * INCOME_TAX_PERCENTAGE)/100;
        }
    }
}
