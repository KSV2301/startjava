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

    private boolean makeGuess(Player player) {
        int guess;
        while (true) {
            System.out.print(player.getName() + ", введите число: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess >= 1 && guess <= 100) {
                    break;
                } else {
                    System.out.println("Ошибка: введите число от 1 до 100");
                }
            } else {
                System.out.println("Ошибка: введите число от 1 до 100");
                scanner.next();
            }
        }
        if (guess > secretNumber) {
            System.out.println("Загаданное число меньше");
        } else if (guess < secretNumber) {
            System.out.println("Загаданное число больше");
        } else {
            System.out.println(player.getName() + " угадал число!");
            return true;
        }
        return false;
    }

    public void start() {
        secretNumber = new Random().nextInt(100) + 1;
        System.out.println("\nИгра началась!");

        while (true) {
            if (makeGuess(player1)) {
                break;
            }
            if (makeGuess(player2)) {
                break;
            }
        }
    }
}