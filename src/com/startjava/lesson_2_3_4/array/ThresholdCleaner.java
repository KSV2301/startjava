package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ThresholdCleaner {
    public static void main(String[] args) {
        double[] values = generateValues(15);

        cleanAboveThreshold(values, -1);
        cleanAboveThreshold(values, 15);
        cleanAboveThreshold(values, 0);
        cleanAboveThreshold(values, 14);
    }

    public static void cleanAboveThreshold(double[] sourceValues, int targetIndex) {
        int length = sourceValues.length;
        System.out.println("Обработка индекса: " + targetIndex);

        if (targetIndex < 0 || targetIndex >= sourceValues.length) {
            System.out.println("Ошибка: некорректный индекс " + targetIndex);
            System.out.println();
            return;
        }

        double[] copy = sourceValues.clone();
        double threshold = copy[targetIndex];
        int clearedCount = 0;

        double[] original = copy.clone();

        for (int i = 0; i < length; i++) {
            if (copy[i] > threshold) {
                copy[i] = 0.0;
                clearedCount++;
            }
        }

        System.out.print("Исходный массив: ");
        printValues(original);

        System.out.printf("Значение по индексу %d: %.3f%n", targetIndex, threshold);

        System.out.print("Измененный массив: ");
        printValues(copy);

        System.out.println("Обнулено ячеек: " + clearedCount);
        System.out.println();
    }

    public static void printValues(double[] values) {
        int length = values.length;
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            System.out.printf("%.3f ", values[i]);
        }

        System.out.print("| ");

        for (int i = 8; i < length; i++) {
            System.out.printf("%.3f ", values[i]);
        }

        System.out.println();
    }

    public static double[] generateValues(int size) {
        double[] values = new double[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            values[i] = random.nextDouble();
        }
        return values;
    }
}
