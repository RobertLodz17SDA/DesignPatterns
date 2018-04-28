package com.designpatterns.Calculator;

public class StudentCalculatorPolicy implements CalculatorPolicy {

    public double calculate(double basicSalary) {
        return basicSalary*1.2;
    }
}
