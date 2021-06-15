package com.lesson1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Input operation +,-,*,/,^,% : ");
        char ch = scanner.next().charAt(0);
        System.out.print("Input number 2: ");
        int num2 = scanner.nextInt();
        scanner.close();
        if (ch == '+'){
            sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        } else if (ch == '-'){
            sum = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + sum);
        } else if (ch == '*'){
            sum = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + sum);
        } else if (ch == '/'){
            sum = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + sum);
        } else if (ch == '^'){
            sum = Math.pow(num1, num2);
            System.out.println(num1 + " ^ " + num2 + " = " + sum);
        } else if (ch == '%'){
            sum = num1 % num2;
            System.out.println(num1 + " % " + num2 + " = " + sum);
        } else if (ch != '+' && ch != '-' && ch != '*' && ch != '/' && ch != '^' && ch != '%'){
            System.out.println("Not operation");
        }
    }
}
