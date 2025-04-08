package com.startjava.lesson_2_3_4.array;

public class SymbolTriangle {
    public static void main(String[] args) {
        printTriangle('0', '9', true);
        printTriangle('/', '!', false);
        printTriangle('A', 'J', false);
    }

    public static void printTriangle(char left, char right, boolean ascending) {
        if ((ascending && left > right) || (!ascending && left < right)) {
            System.out.println("Ошибка: левая граница (" + left + ") > правой (" + right + ")");
            return;
        }

        int height = Math.abs(right - left) + 1;
        int symbolCount = 1;

        if (ascending) {
            for (char i = left; i <= right; i++) {
                printLine(i, symbolCount, height);
                symbolCount += 2;
            }
        } else {
            for (char i = left; i >= right; i--) {
                printLine(i, symbolCount, height);
                symbolCount += 2;
            }
        }
    }

    public static void printLine(char symbol, int symbolCount, int totalLines) {
        int maxWidth = totalLines * 2 - 1;
        int spaces = (maxWidth - symbolCount) / 2;

        StringBuilder line = new StringBuilder();
        line.append(" ".repeat(spaces));
        line.append(String.valueOf(symbol).repeat(symbolCount));

        System.out.println(line);
    }
}
