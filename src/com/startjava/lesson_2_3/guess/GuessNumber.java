package com.startjava.lesson_2_3.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
        this.secretNumber = new Random().nextInt(101) + 1;
    }

    public void start() {
        System.out.println("\nИгра началась!\n");

        while (true) {
            if (makeGuess(player1) || makeGuess(player2)) {
                break;
            }
        }
    }

    private boolean makeGuess(Player player) {
        int number = inputNumber(player);

        if (number == secretNumber) {
            System.out.println("\nПоздравляем, " + player.getName() + " угадал число!");
            return true;
        }

        System.out.println((number > secretNumber) ? "\nЗагаданное число меньше\n" : 
                "\nЗагаданное число больше\n");
        return false;
    }

    private int inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("\nОшибка: введите число\n");
                scanner.next();
                System.out.print(player.getName() + ", введите корректное число: ");
            }
            
            int number = scanner.nextInt();

            if (number >= 1 || number <= 100) {
                return number;
            }
            System.out.println("\nОшибка: введите число от 1 до 100\n");
        }
    }
}