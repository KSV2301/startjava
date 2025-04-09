package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        calculate(null);
        calculate(8, 0, 9);
        calculate(-3, 1, 7, 13);
        calculate(-22, -0);
    }

    public static void calculate(int... values) {
        int length = values.length;

        if (values == null || length == 0) {
            System.out.println("Массив нулевой длины\n");
            return;
        }

        long[] results = new long[length];

        for (int i = 0; i < length; i++) {
            int n = values[i];

            results[i] = (n < 0) ? 1 : factorial(n);

            System.out.println((n < 0) ? "Ошибка: факториал " + n + "! не определен"
                    : n + "! = " + buildExpression(n));
        }

        printResults(results);
        System.out.println();
    }

    public static void printResults(long[] values) {
        int length = values.length;
        System.out.print("Массив результатов: [");
        for (int i = 0; i < length; i++) {
            System.out.print(values[i]);
            if (i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");
    }

    public static String buildExpression(int n) {
        if (n == 0 || n == 1) return "1";

        long result = 1;
        StringBuilder expression = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            result *= i;
            expression.append(i);
            if (i < n) {
                expression.append(" * ");
            }
        }
        return expression + " = " + result;
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
