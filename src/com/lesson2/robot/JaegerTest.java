package com.startjava.lesson2.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerMark5 = new Jaeger("Bracer Phoenix","Mark-5","USA",70.7f,2.1f,3,8,9);
        Jaeger jaegerMark7 = new Jaeger("Bracer","Mark-7","UK",90.5f,12.1f,5,99,23);

        jaegerMark7.setModelName("Bracer Xuyacer");

        jaegerMark5.move();
        jaegerMark5.scanKaiju();
        jaegerMark7.move();
        jaegerMark7.scanKaiju();
    }
}
