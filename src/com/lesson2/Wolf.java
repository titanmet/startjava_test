package com.lesson2;

public class Wolf {
    private String sex;
    private String name;
    private double weight;
    private int age;
    private String color;

    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age > 15){
            System.out.println("Incorrect age...");
        } else {
            this.age = age;
        }
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void walk(){
        System.out.println("Walk");
    }
    public void sitDown(){
        System.out.println("sitDown");
    }
    public void hunt(){
        System.out.println("Hunt");
    }


}
