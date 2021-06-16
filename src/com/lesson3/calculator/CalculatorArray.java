package com.lesson3.calculator;

public class CalculatorArray {
    public double sum;
    private int num1;
    private char ch1;
    public char[] ch = {'+','-','*','/','^','%'};
    private int num2;
    public String answer = "да";

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void calc(){

        if (ch1 == ch[0]) {
            sum = num1 + num2;
            System.out.println(num1 + " " + String.valueOf(ch[0]) + " " + num2 + " = " + sum);
        }
        else if (ch1 == ch[1]) {
            sum = num1 - num2;
            System.out.println(num1 + " " + String.valueOf(ch[1]) + " " + num2 + " = " + sum);
        }
        else if (ch1 == ch[2]) {
            sum = num1 * num2;
            System.out.println(num1 + " " + String.valueOf(ch[2]) + " " + num2 + " = " + sum);
        }
        else if (ch1 == ch[3]) {
            sum = num1 / num2;
            System.out.println(num1 + " " + String.valueOf(ch[3]) + " " + num2 + " = " + sum);
        }
        else if (ch1 == ch[4]) {
            sum = Math.pow(num1, num2);
            System.out.println(num1 + " " + String.valueOf(ch[4]) + " " + num2 + " = " + sum);
        }
        else if (ch1 == ch[5]) {
            sum = num1 % num2;
            System.out.println(num1 + " " + String.valueOf(ch[5]) + " " + num2 + " = " + sum);
        }
        else {
            System.out.println("Not operation");
        }
    }
}
