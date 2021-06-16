package com.lesson3.game;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    int min = 0;
    int max = 100;
    int diff = max - min;
    int c;
    int count1 = 1;
    int count2 = 1;
    Random random = new Random();
    int i = random.nextInt(diff);
    Scanner scanner = new Scanner(System.in);

    public void game(){
        while (true){
            System.out.print("Player 1 number: ");
            Player player1 = new Player("Vasya", c = scanner.nextInt(), new int[]{c});
            int[] c1 = new int[count1];
            count1++;
            System.out.print("Player 2 number: ");
            Player player2 = new Player("Sanya", c = scanner.nextInt(), new int[]{c});
            int[] c2 = new int[count2];
            count2++;
            if (player1.getNumber() > i) {
                System.out.println("Player 1 More");
            } else if (player1.getNumber() < i) {
                System.out.println("Player 1 Less");
            } else {
                System.out.println(" Player 1 Win !!!");
                System.out.println("Player 1 guess number" + " "+ player1.getNumberSet()[0] +" is "+ c1.length +" "+ "attempts");
                scanner.close();
                break;
            }
            if (player2.getNumber() > i) {
                System.out.println("Player 2 More");
            } else if (player2.getNumber() < i) {
                System.out.println("Player 2 Less");
            } else {
                System.out.println("Player 2 Win !!!");
                System.out.println("Player 2 guess number" + " "+ player2.getNumberSet()[0] +" is "+ c2.length +" "+ "attempts");
                scanner.close();
                break;
            }
        }
    }
}
