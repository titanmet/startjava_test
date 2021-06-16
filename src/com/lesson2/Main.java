package com.lesson2;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Slon");
        System.out.println(person.getName()+" "+person.getSex()+" "+person.getAge()+" "+person.getHeight()+" "+person.getWeight());
        person.move();
        person.sitDown();
        person.run();
        person.speak();
        System.out.println(person.learn());

    }
}
