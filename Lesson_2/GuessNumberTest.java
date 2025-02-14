import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        while (true) {
            GuessNumber game = new GuessNumber(player1, player2);
            boolean guessed = false;
            Player currentPlayer = player1;

            System.out.println("\nИгра началась!");

            while (!guessed) {
                System.out.print(currentPlayer.getName() + " вводит число: ");
                int playerGuess = scanner.nextInt();

                if (game.check(playerGuess, currentPlayer)) {
                    guessed = true;
                } else {
                    if (currentPlayer == player1) {
                        currentPlayer = player2;
                    } else {
                        currentPlayer = player1;
                    }
                }
            }

            while (true) {
                System.out.print("\nХотите сыграть еще раз? [yes/no]: ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("yes")) {
                    System.out.println("\n----------------------------------");
                    break;
                } else if (choice.equalsIgnoreCase("no")) {
                    System.out.println("\nПрограмма завершена!");
                    return;
                } else {
                    System.out.println("\nОшибка: введите 'yes' или 'no'\n");
                }
            }
        }
    }
}