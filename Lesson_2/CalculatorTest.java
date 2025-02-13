import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
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

            System.out.println("\nРезультат: " + calculator.getResult());

            while (true) {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("yes")) {
                    System.out.println("\n----------------------------------\n");
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