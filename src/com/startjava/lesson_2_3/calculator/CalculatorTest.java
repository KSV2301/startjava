package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());

            while (true) {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                char operation = scanner.next().charAt(0);
                calculator.setOperation(operation);
                
                if (calculator.getOperation() == operation) {
                    break;
                }
            }
        
            System.out.print("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());

            System.out.println("\nРезультат: " + calculator.calculate());

            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                choice = scanner.next().toLowerCase();

                if (!choice.equals("yes") && !choice.equals("no")) {
                    System.out.println("\nОшибка: введите 'yes' или 'no'\n");
                }
            } while (!choice.equals("yes") && !choice.equals("no"));
        } while (choice.equals("yes"));
        System.out.println("Программа завершена!");
    }
}