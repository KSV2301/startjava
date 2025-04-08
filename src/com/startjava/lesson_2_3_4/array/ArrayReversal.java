package com.startjava.lesson_2_3_4.array;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr2 = {6, 8, 9, 1};
        int[] arr3 = {13, 8, 5, 3, 2, 1, 1};

        reverseAndPrint(arr1);
        reverseAndPrint(arr2);
        reverseAndPrint(arr3);
    }

    public static void reverseAndPrint(int[] values) {
        System.out.print("До реверса: ");
        print(values);

        if (values != null) {
            int length = values.length;
            for (int i = 0; i < length / 2; i++) {
                int temp = values[i];
                values[i] = values[values.length - i - 1];
                values[length - i - 1] = temp;
            }
        }
        System.out.print("После реверса: ");
        print(values);
        System.out.println();
    }

    public static void print(int[] values) {
        if (values == null) {
            System.out.println("null");
            return;
        }

        System.out.print("[");

        int length = values.length;
        for (int i = 0; i < length; i++) {
            System.out.print(values[i]);
            if (i < values.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
