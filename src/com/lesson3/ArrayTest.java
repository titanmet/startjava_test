package com.lesson3;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {12.4f, 2.4f,5.7f,.7f,.9f};
        System.out.println(numbers.length);
        System.out.println(numbers1.length);
//        System.out.println(numbers);
        for (float v : numbers1) {
            System.out.print(v + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        String[] text = new String[3];
        text[0] = "Elephant";
        for(String txt : text){
            System.out.print(txt + " ");
        }
    }
}
