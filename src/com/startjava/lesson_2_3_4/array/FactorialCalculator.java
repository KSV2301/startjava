package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        int[] arr1 = {};
        long[] res1 = calculate(arr1);
        printFactorial(res1, arr1);

        int[] arr2 = null;
        long[] res2 = calculate(arr2);
        printFactorial(res2, arr2);

        int[] arr3 = {8, 0, 9};
        long[] res3 = calculate(arr3);
        printFactorial(res3, arr3);

        int[] arr4 = {-3, 1, 7, 13};
        long[] res4 = calculate(arr4);
        printFactorial(res4, arr4);

        int[] arr5 = {-22, 0};
        long[] res5 = calculate(arr5);
        printFactorial(res5, arr5);
    }

    private static long[] calculate(int... numbers) {
        if (numbers == null) {
            return null;
        }

        long[] results = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            results[i] = (n < 0) ? -1 : factorial(n);
        }
        return results;
    }

    private static void printFactorial(long[] results, int... numbers) {
        if (numbers == null) {
            System.out.println("null\n");
            return;
        }

        if (numbers.length == 0) {
            System.out.println("Массив нулевой длины\n");
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            long result = results[i];

            if (result == -1) {
                System.out.printf("Ошибка: факториал %d! не определен%n", n);
            } else {
                System.out.println(n == 0 || n == 1 ?
                        n + "! = 1" :
                        n + "! = " + buildExpression(n) + " = " + result);
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

    private static String buildExpression(int n) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            sb.append(" * ").append(i);
        }
        return sb.toString();
    }
}
