package com.designpatterns.Calculator;

import java.util.Calendar;

public class GermanyCalculator implements Calculator {

    private double zusAmount;

    private int taxProcentage;

    private CalculatorPolicy calculatorPolicy;

    public GermanyCalculator(CalculatorPolicy calculatorPolicy) {
        this.calculatorPolicy = calculatorPolicy;
        zusAmount = 1400;
        taxProcentage = 10;
    }


    public double calculate(double amount) {
        double newAmount = (amount - zusAmount)-(amount - zusAmount)*(taxProcentage/100);
        return calculatorPolicy.calculate(newAmount);
    }

    public void setCalculatorPolicy(CalculatorPolicy calculatorPolicy) {
        this.calculatorPolicy = calculatorPolicy;
    }
}
