public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");

        int start = -10;
        int end = 21;
        int evenSum = 0;
        int OddSum = 0;
        int currentNumber = start;

        do {
            if (currentNumber % 2 == 0) {
                evenSum += currentNumber;
            } else {
                oddSum += currentNumber;
            }
            currentNumber++;
        } while (currentNumber <= end);

        System.out.println("В отрезке [" + start + "," + end + "] сумма четных чисел = " + 
                sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int min = num1;
        int max = num1;

        if (num2 > max) {
            max = num2;
        } 
        if (num2 < min) {
            min = num2;
        } 
        if (num3 > max) {
            max = num3;
        } 
        if (num3 < min) {
            min = num3;
        }
        
        System.out.print("Числа в интервале (" + max + "," + min + ") в порядке убывания: ");

        for (i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int number = 1234;
        int sumDigits = 0;
        int reversed = 0;
        int tmpNumber = number;

        System.out.println("Число " + number + " поразрядно в обратном порядке: ");

        int count = 1;

        while (tmpNumber > 0) {
            int digit = tmpNumber % 10;
            digitSum += digit;
            reversed = reversed * 10 + digit;
            System.out.println(count + " разряд: " + reversed);
            count++;
            tmpNumber /= 10;
        }

        System.out.println("Сумма цифр: " + digitSum);

        System.out.println("\n4. Вывод чисел в несколько строк\n");

        count = 0;

        for (i = 1; i < 24; i += 2) {
            System.out.printf("%2d ", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }

        int neededZeros = count % 5;
        if (neededZeros > 0) {
            for (int j = 0; j < 5 - neededZeros; j++) {
                System.out.printf("%2d ", 0);
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность\n");

        number = 3242592;
        count = 0;
        tmpNumber = number;

        while (tmpNumber > 0) {
            if (tmpNumber % 10 == 2) {
                count++;
            }
            tmpNumber /= 10;
        }

        if (count % 2 == 0) {
            System.out.println("В " + number + " четное (" + count + ") количество двоек");
        } else {
            System.out.println("В " + number + " нечетное (" + count + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур\n");

        System.out.println("Прямоугольник: ");
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Прямоугольный треугольник: ");
        int row = 5;
        while (row > 0) {
            int col = 0;
            while (col < row) {
                System.out.print("#");
                col++;
            }
            System.out.println();
            row--;
        }

        System.out.println("Равнобедренный треугольник: ");
        row = 1;
        int step = 1;
        do {
            int col = 0;
            do {
                System.out.print("$");
                col++;
            } while (col < row);
            System.out.println();
            if (row == 3) {
                step = -1;
            }
            row += step;
        } while (row > 0);


        System.out.println("\n7. Вывод ASCII-символов\n");

        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");

        for (i = 33; i <= 48; i += 2) {
            System.out.printf("%4d %10c            %-25s%n", i, (char) i, getName(i));
        }

        for (i = 98; i <= 122; i += 2) {
            System.out.printf("%4d %10c            %-25s%n", i, (char) i, getName(i));
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        number = 1234321;
        reversed = 0;
        tmpNumber = number;

        while (tmpNumber > 0) {
            int digit = tmpNumber % 10;
            reversed = reversed * 10 + digit;
            tmpNumber /= 10;
        }

        if (reversed == number) {
            System.out.println("Число " + number + " - палиндром");
        } else {
            System.out.println("Число " + number + " - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым\n");

        number = 123321;

        int firstHalf = number / 1000;
        int secondHalf = number % 1000;
        int firstSum = 0;
        int secondSum = 0;
        int tmpFirstHalf = firstHalf;
        int tmpSecondHalf = secondHalf;

        while (tmpFirstHalf > 0 || tmpSecondHalf > 0 ) {
            if (tmpFirstHalf > 0) {
                firstSum += tmpFirstHalf % 10;
                tmpFirstHalf /= 10;
            }

            if (tmpSecondHalf > 0) {
                secondSum += tmpSecondHalf % 10;
                tmpSecondHalf /= 10;
            }
        }

        if (firstSum == secondSum) {
            System.out.println("Число " + number + " - счастливое");
        } else {
            System.out.println("Число " + number + " - не счастливое");
        }

        System.out.println("Сумма цифр " + firstHalf + " = " + firstSum);
        System.out.println("Сумма " + secondHalf + " = " + secondSum);

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        System.out.println("Таблица Пифагора");

        System.out.print("   |");
        for (i = 2; i <= 9; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println("\n---+---------------------------------");

        for (i = 2; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        } 
    }

    public static String getName(int codePoint) {
        return Character.getName(codePoint);
    }
}