package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ThresholdCleaner {
    public static void main(String[] args) {
        double[] values = generateValues(15);

        double[] cleaned1 = cleanAboveThreshold(values.clone(), -1);
        printCleaning(values, cleaned1, -1);

        double[] cleaned2 = cleanAboveThreshold(values.clone(), 15);
        printCleaning(values, cleaned2, 15);

        double[] cleaned3 = cleanAboveThreshold(values.clone(), 0);
        printCleaning(values, cleaned3, 0);

        double[] cleaned4 = cleanAboveThreshold(values.clone(), 14);
        printCleaning(values, cleaned4, 14);
    }

    private static double[] cleanAboveThreshold(double[] values, int index) {
        if (index < 0 || index >= values.length) {
            return null;
        }

        double threshold = values[index];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > threshold) {
                values[i] = 0.0;
            }
        }
        return values;
    }

    private static void printCleaning(double[] original, double[] cleaned, int index) {
        System.out.println("Обработка индекса: " + index);

        if (cleaned == null) {
            System.out.println("Ошибка: некорректный индекс " + index + "\n-------------------------");
            return;
        }

        System.out.println("\nИсходный массив: ");
        printValues(original);

        System.out.printf("\nЗначение по индексу %d: %.3f%n", index, original[index]);

        System.out.println("\nИзмененный массив: ");
        printValues(cleaned);

        int zeroCount = 0;
        for (double value : cleaned) {
            if (value == 0.0) zeroCount++;
        }

        System.out.println("\nОбнулено ячеек: " + zeroCount + "\n-------------------------");
    }

    private static void printValues(double[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%.3f ", values[i]);
            if (i == 7) System.out.println();
        }
        System.out.println();
    }

    private static double[] generateValues(int size) {
        double[] values = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            values[i] = random.nextDouble();
        }
        return values;
    }
}
