package com.designpatterns.Calculator;

public interface Calculator {

   double calculate(double amount);

   void setCalculatorPolicy(CalculatorPolicy calculatorPolicy);
}
