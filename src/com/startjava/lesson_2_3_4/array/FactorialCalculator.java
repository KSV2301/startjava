package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        int[] arr1 = {};
        long[] res1 = calculate(arr1);
        printFactorialsReport(arr1, res1);

        int[] arr2 = null;
        long[] res2 = calculate(arr2);
        printFactorialsReport(arr2, res2);

        int[] arr3 = {8, 0, 9};
        long[] res3 = calculate(arr3);
        printFactorialsReport(arr3, res3);

        int[] arr4 = {-3, 1, 7, 13};
        long[] res4 = calculate(arr4);
        printFactorialsReport(arr4, res4);

        int[] arr5 = {-22, 0};
        long[] res5 = calculate(arr5);
        printFactorialsReport(arr5, res5);
    }

    private static long[] calculate(int... numbers) {
        if (numbers == null) {
            return null;
        }

        int length = numbers.length;
        long[] factorials = new long[length];

        for (int i = 0; i < length; i++) {
            factorials[i] = (numbers[i] < 0) ? -1 : factorial(numbers[i]);
        }
        return factorials;
    }

    private static void printFactorialsReport(int[] numbers, long[] factorials) {
        if (numbers == null) {
            System.out.println("null\n");
            return;
        }

        int length = numbers.length;

        if (length == 0) {
            System.out.println("Массив нулевой длины\n");
            return;
        }

        for (int i = 0; i < length; i++) {
            int n = numbers[i];
            long factorial = factorials[i];

            if (factorial == -1) {
                System.out.println("Ошибка: факториал " + n + "! не определен");
            } else {
                System.out.println(buildExpression(n, factorial));
            }
        }
        System.out.println();
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static String buildExpression(int n, long factorials) {
        return (n == 0 || n == 1) ?
                n + "! = 1" :
                n + "! = " + buildSteps(n) + " = " + factorials;
    }

    private static String buildSteps(int n) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            sb.append(" * ").append(i);
        }
        return sb.toString();
    }
}
