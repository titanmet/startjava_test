package com.startjava.lesson2.calculator;

public class Calculator {
    public double sum;
    public int num1;
    public char ch;
    public int num2;
    public String answer = "да";

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void calc(){
            switch (ch){
                case ('+'):
                    sum = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + sum);
                    break;
                case ('-'):
                    sum = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + sum);
                    break;
                case ('*'):
                    sum = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + sum);
                    break;
                case ('/'):
                    sum = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + sum);
                    break;
                case ('^'):
                    sum = Math.pow(num1, num2);
                    System.out.println(num1 + " ^ " + num2 + " = " + sum);
                    break;
                case ('%'):
                    sum = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + sum);
                    break;
                default:
                    System.out.println("Not operation");
            }
    }
}
