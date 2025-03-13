package com.startjava.lesson_1.base;

import java.math.BigDecimal;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера\n");

        byte cpuCores = 8;
        short ramAmount = 16;
        int ssdCapacity = 500;
        long hddCapacity = 2000_000_000_000L;
        float baseCpuFreq = 3.6f;
        double turboCpuFreq = 5.0;
        char cpuManufacturer = 'I';
        boolean hasGraphicsCard = true;

        System.out.println("Количество ядер процессора - " + cpuCores);
        System.out.println("Объем оперативной памяти - " + ramAmount + " ГБ");
        System.out.println("Объем SSD - " + ssdCapacity + " ГБ");
        System.out.println("Объем HDD - " + hddCapacity / 1_000_000_000 + " ГБ");
        System.out.println("Базовая частота процессора - " + baseCpuFreq + " ГГц");
        System.out.println("Турбо частота процессора - " + turboCpuFreq + " ГГц");
        System.out.println("Производитель процессора (1ая буква) - " + cpuManufacturer);
        System.out.println("Имеется ли видеокарта? Ответ: " + hasGraphicsCard);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        double penPrice = 105.5;
        double bookPrice = 235.83;
        double discount = 0.11;

        double basePrice = penPrice + bookPrice;
        double discountAmount = basePrice * discount;
        double discountPrice = basePrice - discountAmount;

        System.out.println("Стоимость товаров без скидки - " + basePrice + " руб.");
        System.out.println("Сумму скидки - " + discountAmount + " руб.");
        System.out.println("Стоимость товаров со скидкой - " + discountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J   a v     v a");
        System.out.println("   J  a a v   v a a");
        System.out.println("J  J aaaaa v v aaaaa");
        System.out.println(" JJ a     a v a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        
        // byte
        byte extremesByteValue = -128;
        System.out.println("Минимальное значение byte - " + extremesByteValue);
        extremesByteValue++;
        System.out.println("byte после инкремента - " + extremesByteValue);
        extremesByteValue--;
        System.out.println("byte после декремента - " + extremesByteValue);

        extremesByteValue = 127;
        System.out.println("\nМаксимальное значение byte - " + extremesByteValue);
        extremesByteValue++;
        System.out.println("byte после инкремента - " + extremesByteValue);
        extremesByteValue--;
        System.out.println("byte после декремента - " + extremesByteValue);
        
        // short
        short extremesShortValue = -32_768;
        System.out.println("\nМинимальное значение short - " + extremesShortValue);
        extremesShortValue++;
        System.out.println("short после инкремента - " + extremesShortValue);
        extremesShortValue--;
        System.out.println("short после декремента - " + extremesShortValue);

        extremesShortValue = 32_767;
        System.out.println("\nМаксимальное значение short - " + extremesShortValue);
        extremesShortValue++;
        System.out.println("short после инкремента - " + extremesShortValue);
        extremesShortValue--;
        System.out.println("short после декремента - " + extremesShortValue);

        // int
        int extremesIntValue = -2_147_483_648;
        System.out.println("\nМинимальное значение int - " + extremesIntValue);
        extremesIntValue++;
        System.out.println("int после инкремента - " + extremesIntValue);
        extremesIntValue--;
        System.out.println("int после декремента - " + extremesIntValue);

        extremesIntValue = 2_147_483_647;
        System.out.println("\nМаксимальное значение int - " + extremesIntValue);
        extremesIntValue++;
        System.out.println("int после инкремента - " + extremesIntValue);
        extremesIntValue--;
        System.out.println("int после декремента - " + extremesIntValue);

        // long
        long extremesLongValue = -9_223_372_036_854_775_808L;
        System.out.println("\nМинимальное значение long - " + extremesLongValue);
        extremesLongValue++;
        System.out.println("long после инкремента - " + extremesLongValue);
        extremesLongValue--;
        System.out.println("long после декремента - " + extremesLongValue);

        extremesLongValue = 9_223_372_036_854_775_807L;
        System.out.println("\nМаксимальное значение long - " + extremesLongValue);
        extremesLongValue++;
        System.out.println("long после инкремента - " + extremesLongValue);
        extremesLongValue--;
        System.out.println("long после декремента - " + extremesLongValue);

        // char
        char extremesCharValue = 0;
        System.out.println("\nМинимальное значение char - " + (int) extremesCharValue);
        extremesCharValue++;
        System.out.println("char после инкремента - " + (int) extremesCharValue);
        extremesCharValue--;
        System.out.println("char после декремента - " + (int) extremesCharValue);

        extremesCharValue = 65_535;
        System.out.println("\nМаксимальное значение char - " + (int) extremesCharValue);
        extremesCharValue++;
        System.out.println("char после инкремента - " + (int) extremesCharValue);
        extremesCharValue--;
        System.out.println("char после декремента - " + (int) extremesCharValue);

        System.out.println("\n5. Перестановка значений переменных\n");

        int num1 = 2;
        int num2 = 5;

        System.out.println("Исходные значения переменных:");
        System.out.println("Первая переменная - " + num1);
        System.out.println("Вторая переменная - " + num2);
        
        System.out.println("\nСпособ перестановки с помощью третьей переменной:");

        int tmp = num2;
        num2 = num1;
        num1 = tmp;

        System.out.println("Первая переменная - " + num1);
        System.out.println("Вторая переменная - " + num2);

        System.out.println("\nСпособ перестановки с помощью арифметических операций:");

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;

        System.out.println("Первая переменная - " + num1);
        System.out.println("Вторая переменная - " + num2);

        System.out.println("\nСпособ перестановки с помощью побитовой операции ^:");

        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;

        System.out.println("Первая переменная - " + num1);
        System.out.println("Вторая переменная - " + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char caret = '^';
        char tilde = '~';

        System.out.println((int) dollar + " | " + dollar);
        System.out.println((int) asterisk + " | " + asterisk);
        System.out.println((int) atSign + " | " + atSign);
        System.out.println((int) caret + " | " + caret);
        System.out.println((int) tilde + " | " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + 
                rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + 
                underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа\n");

        int number = 123;

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int digitSum = hundreds + tens + ones;
        int digitProduct = hundreds * tens * ones;

        System.out.println("Число " + number + " содержит:");
        System.out.println("    сотен - " + hundreds);
        System.out.println("    десятков - " + tens);
        System.out.println("    единиц - " + ones);
        System.out.println("Сумма разрядов = " + digitSum);
        System.out.println("Произведение разрядов = " + digitProduct);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды\n");

        int time = 86399;

        int hh = time / 3600;
        int mm = (time % 3600) / 60;
        int ss = time % 60;

        System.out.println(hh + ":" + mm + ":" + ss);

        System.out.println("\n10. Расчет стоимости товара со скидкой\n");

        BigDecimal penPriceBd = new BigDecimal("105.5");
        BigDecimal bookPriceBd = new BigDecimal("235.83");
        BigDecimal discountBd = new BigDecimal("0.11");

        BigDecimal basePriceBd = penPriceBd.add(bookPriceBd);
        BigDecimal discountAmountBd = basePriceBd.multiply(discountBd);
        BigDecimal discountPriceBd = basePriceBd.subtract(discountAmountBd);

        System.out.println("Стоимость товаров без скидки - " + basePriceBd + " руб.");
        System.out.println("Сумму скидки - " + discountAmountBd + " руб.");
        System.out.println("Стоимость товаров со скидкой - " + discountPriceBd + " руб.");
    }
}