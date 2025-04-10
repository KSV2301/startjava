package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reversal {
    public static void main(String[] args) {
        int[] arr = new int[0];
        printArray("   До реверса", arr);
        reverse(arr);
        printArray("После реверса", arr);

        int[] arr1 = null;
        printArray("   До реверса", arr1);
        reverse(arr1);
        printArray("После реверса", arr1);

        int[] arr2 = {6, 8, 9, 1};
        printArray("   До реверса", arr2);
        reverse(arr2);
        printArray("После реверса", arr2);

        int[] arr3 = {13, 8, 5, 3, 2, 1, 1};
        printArray("   До реверса", arr3);
        reverse(arr3);
        printArray("После реверса", arr3);
    }

    private static void reverse(int[] numbers) {
        if (numbers == null || numbers.length == 0) return;

        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[--length];
            numbers[length] = temp;
        }
    }

    private static void printArray(String message, int[] numbers) {
        System.out.printf("%-15s", message + ":");

        if (numbers == null) {
            System.out.println("null");
            return;
        }

        System.out.println(Arrays.toString(numbers));
    }
}