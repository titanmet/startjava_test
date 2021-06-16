package com.startjava.lesson1;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        boolean isMan = true;
        double height = 1.90;
        char[] name = {'M','E','N'};
        if(age > 20) {
            System.out.println("Age > 20");
        }

        if(isMan) {
            System.out.println("This is man");
        }

        if(!isMan) {
            System.out.println("This is girl");
        }

        if(height < 1.80) {
            System.out.println("This man is small");
        } else {
            System.out.println("This man is long");
        }

        if(name[0] == 'M') {
            System.out.println("First letter M");
        } else if(name[0] == 'I') {
            System.out.println("First letter I");
        } else {
            System.out.println("First letter other");
        }
    }
}
