import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = new Random().nextInt(100) + 1;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public boolean checkGuess(int guess, Player currentPlayer) {
        if (guess < 1 || guess > 100) {
            System.out.println("Ошибка: введите число от 1 до 100");
            return false;
        }
        if (guess > secretNumber) {
            System.out.println("Загаданное число меньше");
            return false;
        } else if (guess < secretNumber) {
            System.out.println("Загаданное число больше");
            return false;
        } else {
            System.out.println(currentPlayer.getName() + " угадал число!");
            return true;
        }
    }
}