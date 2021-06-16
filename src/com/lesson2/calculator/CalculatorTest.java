package com.startjava.lesson2.calculator;

import com.startjava.lesson1.calculator.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (calculator.getAnswer().equals("да")){
            System.out.print("Input number 1: ");
            calculator.setNum1(scanner.nextInt());
            System.out.print("Input operation +,-,*,/,^,% : ");
            calculator.setCh(scanner.next().charAt(0));
            System.out.print("Input number 2: ");
            calculator.setNum2(scanner.nextInt());

            calculator.calc();

            do {
                System.out.print("Хотите продолжить ? [да / нет]: ");
                calculator.setAnswer(scanner.next());
            }while (!calculator.getAnswer().equals("да") && !calculator.getAnswer().equals("нет"));
        }
    }
}
