package com.startjava.lesson2.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    int min = 0;
    int max = 100;
    int diff = max - min;
    Random random = new Random();
    int i = random.nextInt(diff);
    Scanner scanner = new Scanner(System.in);

    public void game(){
        while (true){
            System.out.print("Player 1 number: ");
            Player player1 = new Player("Vasya", scanner.nextInt());
            System.out.print("Player 2 number: ");
            Player player2 = new Player("Sanya", scanner.nextInt());
            if (player1.getNumber() > i) {
                System.out.println("Player 1 More");
            } else if (player1.getNumber() < i) {
                System.out.println("Player 1 Less");
            } else {
                System.out.println(" Player 1 Win !!!");
                scanner.close();
                break;
            }
            if (player2.getNumber() > i) {
                System.out.println("Player 2 More");
            } else if (player2.getNumber() < i) {
                System.out.println("Player 2 Less");
            } else {
                System.out.println("Player 2 Win !!!");
                scanner.close();
                break;
            }
        }
    }
}
