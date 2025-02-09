public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");

        int start = -10;
        int end = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int i = start;

        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i <= end);

        System.out.println("В отрезке [" + start + "," + end + "] сумма четных чисел = " + 
                sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int min;
        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }

        int max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
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

        while (tmpNumber > 0) {
            int digit = tmpNumber % 10;
            sumDigits += digit;
            reversed = reversed * 10 + digit;
            tmpNumber /= 10;
        }

        System.out.println("Число " + number + " в обратном порядке: " + reversed);
        System.out.println("Сумма цифр: " + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк\n");

        int count = 0;

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
            int digit = tmpNumber % 10;
            if (digit == 2) {
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
        i = 1;
        do {
            int j = 0;
            do {
                System.out.print("$");
                j++;
            } while (j < i);
            System.out.println();
            i++;
        } while (i <= 3);

        i = 2;
        do {
            int j = 0;
            do {
                System.out.print("$");
                j++;
            } while (j < i);
            System.out.println();
            i--;
        } while (i > 0);

        System.out.println("\n7. Вывод ASCII-символов\n");

        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");

        for (i = 33; i <= 48; i += 2) {
            System.out.printf("%4d %10c       %-25s%n", i, (char) i, getName(i));
        }

        for (char c = 'b'; c <= 'z'; c += 2) {
            System.out.printf("%4d %10c       %-25s%n", (int) c, c, getName(c));
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
        int sumFirst = 0;
        int tmpFirstHalf = firstHalf;
        
        while (tmpFirstHalf > 0) {
            int digit = tmpFirstHalf % 10;
            sumFirst += digit;
            tmpFirstHalf /= 10;
        }

        int secondHalf = number % 1000;
        int sumSecond = 0;
        int tmpSecondHalf = secondHalf;
        
        while (tmpSecondHalf > 0) {
            int digit = tmpSecondHalf % 10;
            sumSecond += digit;
            tmpSecondHalf /= 10;
        }

        if (sumFirst == sumSecond) {
            System.out.println("Число " + number + " - счастливое");
        } else {
            System.out.println("Число " + number + " - не счастливое");
        }

        System.out.println("Сумма цифр " + firstHalf + " = " + sumFirst);
        System.out.println("Сумма " + secondHalf + " = " + sumSecond);

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