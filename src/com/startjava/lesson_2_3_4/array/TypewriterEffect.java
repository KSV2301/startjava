package com.startjava.lesson_2_3_4.array;

public class TypewriterEffect {
    public static void main(String[] args) {
        printWithTypewriter("Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n" +
                "- James Gosling");
        printWithTypewriter("Чтобы написать чистый код, мы сначала пишем грязный код " +
                ", затем рефакторим его.\n" + "- Robert Martin");
        printWithTypewriter(null);
        printWithTypewriter("");
    }

    public static void printWithTypewriter(String text) {
        if (text == null) {
            System.out.println("Ошибка: null - строка\n");
            return;
        }

        if (text.isBlank()) {
            System.out.println("Ошибка: пустая строка\n");
            return;
        }

        String[] cleanedWords = text.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").split("\\s+");

        int shortestIndex = 0;
        int longestIndex = 0;

        int wordCount = cleanedWords.length;
        for (int i = 1; i < wordCount; i++) {
            if (cleanedWords[i].length() < cleanedWords[shortestIndex].length()) shortestIndex = i;
            if (cleanedWords[i].length() > cleanedWords[longestIndex].length()) longestIndex = i;
        }

        String shortest = cleanedWords[shortestIndex];
        String longest = cleanedWords[longestIndex];

        String[] originalWords = text.split("\\s+");

        int from = -1;
        int to = -1;

        int length = originalWords.length;
        for (int i = 0; i < length; i++) {
            String clean = originalWords[i].replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "");
            if (clean.equals(shortest) && from == -1) from = i;
            if (clean.equals(longest) && to == -1) to = i;
            if (from != -1 && to != -1) break;
        }

        if (from == -1 || to == -1) {
            System.out.println("Ошибка: не найдены границы для выделения слов\n");
            return;
        }

        int start = Math.min(from, to);
        int end = Math.max(from, to);

        for (int i = 0; i < length; i++) {
            String word;

            if (i >= start && i <= end) {
                word = originalWords[i].toUpperCase();
            } else {
                word = originalWords[i];
            }

            printSlow(word);
            System.out.print(" ");
        }

        System.out.println("\n");
    }

    public static void printSlow(String word) {
        for (char chars : word.toCharArray()) {
            System.out.print(chars);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Ошибка: выполнение прервано\n");
                return;
            }
        }
    }
}
