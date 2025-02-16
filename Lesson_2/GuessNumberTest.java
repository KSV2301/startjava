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

            while (true) {
                System.out.print("\nХотите сыграть еще раз? [yes/no]: ");
                choice = scanner.next();

                if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no")) {
                    System.out.println("\n----------------------------------\n");
                    break;
                } else {
                    System.out.println("\nОшибка: введите 'yes' или 'no'\n");
                }
            }
        } while (choice.equalsIgnoreCase("yes"));
    }
}