package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueRandomGenerator {
    public static void main(String[] args) {
        int[] params1 = {-30, -10, 23};
        int[] values1 = generate(params1);
        print(values1);

        int[] params2 = {10, 50, 10};
        int[] values2 = generate(params2);
        print(values2);

        int[] params3 = {-34, -34, 0};
        int[] values3 = generate(params3);
        print(values3);

        int[] params4 = {-1, 2, -3};
        int[] values4 = generate(params4);
        print(values4);

        int[] params5 = {5, -8, 2};
        int[] values5 = generate(params5);
        print(values5);
    }

    private static int[] generate(int[] params) {
        int left = params[0];
        int right = params[1];
        int count = params[2];

        if (left > right) {
            System.out.println("Ошибка: левая граница (" + left + ") > правой (" + right + ")");
            return null;
        }

        if (count < 1) {
            System.out.println("Ошибка: количество чисел в строке не должно быть < 1 (" + count + ")");
            return null;
        }

        int rangeLength = right - left + 1;
        if (rangeLength <= 0) {
            System.out.println("Ошибка: длина массива должна быть > 0 (" + rangeLength + ")");
            return null;
        }

        int maxCount = (int) (rangeLength * 0.75);
        int actualCount = Math.min(count, maxCount);
        int[] result = new int[actualCount];
        Random random = new Random();
        int filled = 0;

        while (filled < actualCount) {
            int candidate = random.nextInt(rangeLength) + left;
            if (!contains(result, filled, candidate)) {
                result[filled++] = candidate;
            }
        }

        Arrays.sort(result);
        return result;
    }

    private static boolean contains(int[] data, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) return true;
        }
        return false;
    }

    private static void print(int[] values) {
        if (values != null) {
            System.out.println(Arrays.toString(values));
        }
    }
}
