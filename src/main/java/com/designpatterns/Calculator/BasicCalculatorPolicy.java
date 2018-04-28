package com.designpatterns.Calculator;

public class BasicCalculatorPolicy implements CalculatorPolicy {

    public double calculate(double basicSalary) {
        return basicSalary;
    }
}
