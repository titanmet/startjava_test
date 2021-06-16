package com.lesson2;

public class Person {
    private String name = "Vasya";
    private String sex = "Male";
    private double height = 1.75;
    private double weight = 75.8;
    private int age = 37;

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name == ""){
            System.out.println("Not empty");
        } else {
            this.name = name;
        }
    }
    public String getSex(){
        return sex;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }

    public void move() {
        System.out.println("Move");
    }
    public void sitDown() {
        System.out.println("Sitdown");
    }
    public void run(){
        System.out.println("Run");
    }
    void speak(){
        System.out.println("Speak");
    }
    String learn(){
        return "learning...";
    }

}
