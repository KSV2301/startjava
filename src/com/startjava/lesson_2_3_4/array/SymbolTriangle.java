package com.startjava.lesson_2_3_4.array;

public class SymbolTriangle {
    public static void main(String[] args) {
        char[] symbols1 = generateSymbols('0', '9', true);
        printTriangle(symbols1);

        char[] symbols2 = generateSymbols('/', '!', false);
        printTriangle(symbols2);

        char[] symbols3 = generateSymbols('A', 'J', false);
        printTriangle(symbols3);

        char[] symbols4 = generateSymbols('z', 'a', true);
        printTriangle(symbols4);
    }

    private static char[] generateSymbols(char left, char right, boolean ascending) {
        if ((ascending && left > right) || (!ascending && left < right)) {
            System.out.println("Ошибка: левая граница (" + left + ") > правой (" + right + ")");
            return null;
        }

        int length = Math.abs(right - left) + 1;
        char[] symbols = new char[length];

        for (int i = 0; i < length; i++) {
            symbols[i] = ascending ? (char) (left + i) : (char) (left - i);
        }
        return symbols;
    }

    private static void printTriangle(char[] symbols) {
        if (symbols == null) return;

        int height = symbols.length;
        int symbolCount = 1;

        for (int i = 0; i < height; i++) {
            printLine(symbols[i], symbolCount, height);
            symbolCount += 2;
        }

        System.out.println();
    }

    private static void printLine(char symbol, int symbolCount, int totalLines) {
        int maxWidth = totalLines * 2 - 1;
        int spaces = (maxWidth - symbolCount) / 2;

        System.out.print(" ".repeat(spaces));
        System.out.println(String.valueOf(symbol).repeat(symbolCount));
    }
}
