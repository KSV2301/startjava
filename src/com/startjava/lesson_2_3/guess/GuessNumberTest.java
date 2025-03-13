package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        String choice;

        do {
            GuessNumber game = new GuessNumber(player1, player2, scanner);
            game.start();

            do {
                System.out.print("\nХотите сыграть еще раз? [yes/no]: ");
                choice = scanner.next().toLowerCase();

                if (!choice.equals("yes") && !choice.equals("no")) {
                    System.out.println("\nОшибка: введите 'yes' или 'no'\n");
                }
            } while (!choice.equals("yes") && !choice.equals("no"));
        } while (choice.equals("yes"));
        System.out.println("\nИгра завершена!");
    }
}