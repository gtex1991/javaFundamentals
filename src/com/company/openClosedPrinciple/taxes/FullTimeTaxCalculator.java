package com.company.openClosedPrinciple.taxes;

import com.company.designprinciples.model.Employee;

public class FullTimeTaxCalculator  implements TaxCalculator{

    private final int RETIREMENT_TAX_PERCENTAGE = 10;
    private final int INCOME_TAX_PERCENTAGE = 16;
    private final int BASE_HEALTH_INSURANCE = 100;

    @Override
    public double calculate(Employee employee) {
        return BASE_HEALTH_INSURANCE
                + employee.getMonthlyIncome()*RETIREMENT_TAX_PERCENTAGE
                + employee.getMonthlyIncome()*INCOME_TAX_PERCENTAGE;
    }
}
