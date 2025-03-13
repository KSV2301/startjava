package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setOrigin("USA");
        jaeger1.setSpeed(7);
        jaeger1.setStrength(8);
        jaeger1.setArmor(9);
        System.out.println(jaeger1);

        Jaeger jaeger2 = new Jaeger("Cherno Alpha", "Russia", 3, 10, 10);
        System.out.println(jaeger2);
    }
}