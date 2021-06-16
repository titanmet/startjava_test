package com.lesson3.game;

public class Player {
    private String name;
    private int number;
    private int[] numberSet;

    public Player(String name, int number, int[] numberSet) {
        this.name = name;
        this.number = number;
        this.numberSet = numberSet;
    }

    public int[] getNumberSet() {
        return numberSet;
    }

    public void setNumberSet(int[] numberSet) {
        this.numberSet = numberSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
