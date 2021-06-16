package com.lesson2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("WolfDog");
        wolf.setAge(12);
        wolf.setSex("man");
        wolf.setColor("dark");

        System.out.println(wolf.getName()+" "+wolf.getAge()+" "+wolf.getSex()+" "+wolf.getColor());
        wolf.walk();
        wolf.sitDown();
        wolf.hunt();
    }
}
