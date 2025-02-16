public class Calculator {
    private int number1;
    private int number2;
    private char operation;

    public void setNumber1(int number1) { 
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        switch (operation) {
            case '+':
                this.operation = operation;
                break;
            case '-':
                this.operation = operation;
                break;
            case '*':
                this.operation = operation;
                break;
            case '/':
                this.operation = operation;
                break;
            case '^':
                this.operation = operation;
                break;
            case '%':
                this.operation = operation;
                break;
            default:
                System.out.println("\nОшибка: операция '" + operation + "' не поддерживается\n");
        }
    }

    public double calculate() {
        double result = 0.0;

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("\nОшибка: деление на ноль запрещено");
                    return 0.0;
                }
                result = (double) number1 / number2;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < Math.abs(number2); i++) {
                    result *= number1;
                }
                if (number2 < 0) {
                    result = 1.0 / result;
                }
                break;
            case '%':
                if (number2 == 0) {
                    System.out.println("\nОшибка: деление на ноль запрещено");
                    return 0.0;
                }
                result = number1 % number2;
        }
        return result;
    }
}