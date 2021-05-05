package com.company.openClosedPrinciple.taxes;

import com.company.designprinciples.model.Employee;

public interface TaxCalculator {
    double calculate (Employee employee);
}
