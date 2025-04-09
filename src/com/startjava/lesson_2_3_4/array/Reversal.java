package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reversal {
    public static void main(String[] args) {
        int[] arr = {};
        reverse(arr);
        printArray(arr);

        int[] arr1 = null;
        reverse(arr1);
        printArray(arr1);

        int[] arr2 = {6, 8, 9, 1};
        reverse(arr2);
        printArray(arr2);

        int[] arr3 = {13, 8, 5, 3, 2, 1, 1};
        reverse(arr3);
        printArray(arr3);
    }

    private static void reverse(int[] numbers) {
        if (numbers == null) {
            return;
        }

        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[--length];
            numbers[length] = temp;
        }
    }

    private static void printArray(int[] numbers) {
        if (numbers == null) {
            System.out.println("До реверса: null");
            System.out.println("После реверса: null");
            System.out.println();
            return;
        }

        int[] copy = numbers.clone();
        reverse(copy);

        System.out.println("До реверса: " + Arrays.toString(copy));
        System.out.println("После реверса: " + Arrays.toString(numbers));
        System.out.println();
    }
}
