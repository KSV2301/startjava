package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reversal {
    public static void main(String[] args) {
        reverseAndPrint(new int[0]);
        reverseAndPrint(null);
        reverseAndPrint(new int[] {6, 8, 9, 1});
        reverseAndPrint(new int[] {13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverseAndPrint(int[] numbers) {
        System.out.println("До реверса: " + Arrays.toString(numbers));

        if (numbers != null) {
            reverse(numbers);
        }

        System.out.println("После реверса: " + Arrays.toString(numbers));
        System.out.println();
    }

    private static void reverse(int[] numbers) {
        if (numbers == null) {
            System.out.println("null");
            return;
        }

        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[--length];
            numbers[length] = temp;
        }
    }
}
