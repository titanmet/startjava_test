package com.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Divine Number: ");
            int num = scanner.nextInt();
            if (num > i) {
                System.out.println("More");
            } else if (num < i) {
                System.out.println("Less");
            } else {
                System.out.println("You win");
                scanner.close();
                break;
            }
        }
    }
}
