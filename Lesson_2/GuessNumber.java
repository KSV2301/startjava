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
    }

    private int inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("\nОшибка: введите число\n");
            scanner.next();
            System.out.print(player.getName() + ", введите корректное число: ");
        }
        return scanner.nextInt();
    }

    private int inputValidNumber(Player player) {
        int number;
        do {
            number = inputNumber(player);
            if (number < 1 || number > 100) {
                System.out.println("\nОшибка: введите число от 1 до 100\n");
            }
        } while (number < 1 || number > 100);
        return number;
    }

    private boolean makeGuess(Player player) {
        int guess = inputValidNumber(player);

        if (guess > secretNumber) {
            System.out.println("\nЗагаданное число меньше\n");
        } else if (guess < secretNumber) {
            System.out.println("\nЗагаданное число больше\n");
        } else {
            System.out.println("\nПоздравляем, " + player.getName() + " угадал число!");
            return true;
        }
        return false;
    }

    public void start() {
        secretNumber = new Random().nextInt(100) + 1;
        System.out.println("\nИгра началась!\n");

        while (true) {
            if (makeGuess(player1) || makeGuess(player2)) {
                break;
            }
        }
    }
}