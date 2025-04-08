package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("самец");
        wolf.setName("Акула");
        wolf.setWeight(42.7f);
        wolf.setAge(10);
        wolf.setColor("коричнево-белый");

        System.out.println("Характеристики волка:");

        System.out.println("Кличка - " + wolf.getName() + "\nПол - " + wolf.getGender() + 
                "\nВес - " + wolf.getWeight() + " кг" + "\nВозраст - " + wolf.getAge() + " лет" +
                "\nОкрас - " + wolf.getColor());

        System.out.println("\nДействия волка:");

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}