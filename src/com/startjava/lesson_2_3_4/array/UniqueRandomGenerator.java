package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueRandomGenerator {
    public static void main(String[] args) {
        generate(-30, -10, 23);
        generate(10, 50, 10);
        generate(-34, -34, 0);
        generate(-1, 2, -3);
        generate(5, -8, 2);
    }

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void generate(int left, int right, int count) {
        if (left > right) {
            System.out.println("Ошибка: левая граница (" + left + ") > правой (" + right + ")");
            return;
        }

        if (count < 1) {
            System.out.println("Ошибка: количество чисел в строке не должно быть < 1 (" + count + ")");
            return;
        }

        int rangeLength = right - left + 1;
        if (rangeLength <= 0) {
            System.out.println("Ошибка: длина массива должна быть > 0 (" + rangeLength + ")");
            return;
        }

        int maxCount = (int) (rangeLength * 0.75);
        int actualCount = Math.min(count, maxCount);

        int[] uniqueValues = new int[actualCount];
        Random random = new Random();
        int filled = 0;

        while (filled < actualCount) {
            int candidate = random.nextInt(rangeLength) + left;

            if (!contains(uniqueValues, filled, candidate)) {
                uniqueValues[filled] = candidate;
                filled++;
            }
        }

        Arrays.sort(uniqueValues);
        print(uniqueValues);
    }

    private static boolean contains(int[] data, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    private static void print(int[] values) {
        System.out.println(Arrays.toString(values));
    }
}
