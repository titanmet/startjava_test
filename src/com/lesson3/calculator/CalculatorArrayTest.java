package com.lesson3.calculator;

import com.startjava.lesson1.calculator.Calculator;

import java.util.Scanner;

public class CalculatorArrayTest {
    public static void main(String[] args) {
        CalculatorArray calculatorArray = new CalculatorArray();
        Scanner scanner = new Scanner(System.in);
        while (calculatorArray.getAnswer().equals("да")){
            System.out.print("Input number 1: ");
            calculatorArray.setNum1(scanner.nextInt());
            System.out.print("Input operation +,-,*,/,^,% : ");
            calculatorArray.setCh1(scanner.next().charAt(0));
            System.out.print("Input number 2: ");
            calculatorArray.setNum2(scanner.nextInt());

            calculatorArray.calc();

            do {
                System.out.print("Хотите продолжить ? [да / нет]: ");
                calculatorArray.setAnswer(scanner.next());
            }while (!calculatorArray.getAnswer().equals("да") && !calculatorArray.getAnswer().equals("нет"));
        }
    }
}
