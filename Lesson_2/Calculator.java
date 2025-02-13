public class Calculator {
    private int number1;
    private int number2;
    private char operation;
    private double result;

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

    public double getResult() {
        switch (operation) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 == 0) {
                    System.out.println("\nОшибка: деление на ноль запрещено");
                    return 0.0;
                }
                return (double) number1 / number2;
            case '^':
                double result = 1;
                if (number2 >= 0) {
                    for (int i = 0; i < number2; i++) {
                        result *= number1;
                    }
                } else {
                    for (int i = 0; i < -number2; i++) {
                        result *= number1;
                    }
                    result = 1.0 / result;
                }
                return result;
            case '%':
                if (number2 == 0) {
                    System.out.println("\nОшибка: деление на ноль запрещено");
                    return 0.0;
                }
                return number1 % number2;
            default:
                return 0.0;
        }
    }
}