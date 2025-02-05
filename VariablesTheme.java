import java.math.BigDecimal;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера\n");

        byte cpuCores = 8;
        short amountRam = 16;
        int ssdCapacity = 500;
        long hddCapacity = 2000_000_000_000L;
        float baseFrequencyProcessor = 3.6f;
        double turboFrequencyProcessor = 5.0;
        char cpuManuFacturer = 'I';
        boolean hasGraphicsCard = true;

        System.out.println("Количество ядер процессора - " + cpuCores);
        System.out.println("Объем оперативной памяти - " + amountRam + " ГБ");
        System.out.println("Объем SSD - " + ssdCapacity + " ГБ");
        System.out.println("Объем HDD - " + hddCapacity / 1_000_000_000 + " ГБ");
        System.out.println("Базовая частота процессора - " + baseFrequencyProcessor + " ГГц");
        System.out.println("Турбо частота процессора - " + turboFrequencyProcessor + " ГГц");
        System.out.println("Производитель процессора (1ая буква) - " + cpuManuFacturer);
        System.out.println("Имеется ли видеокарта? Ответ: " + hasGraphicsCard);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        double penPrice = 105.5;
        double bookPrice = 235.83;
        double discount = 0.11;

        double totalPrice = penPrice + bookPrice;
        double discountAmount = totalPrice * discount;
        double discountPrice = totalPrice - discountAmount;

        System.out.println("Стоимость товаров без скидки - " + totalPrice + " руб.");
        System.out.println("Сумму скидки - " + discountAmount + " руб.");
        System.out.println("Стоимость товаров со скидкой - " + discountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J   a v     v a");
        System.out.println("   J  a a v   v a a");
        System.out.println("J  J aaaaa v v aaaaa");
        System.out.println(" JJ a     a v a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        char maxChar = 65_535;

        System.out.println("Первоначальное значение:");
        System.out.println("byte - " + maxByte);
        System.out.println("short - " + maxShort);
        System.out.println("int - " + maxInt);
        System.out.println("long - " + maxLong);
        System.out.println("char - " + (int) maxChar);

        maxByte++;
        maxShort++;
        maxInt++;
        maxLong++;
        maxChar++;

        System.out.println("\nЗначение после инкремента на единицу:");
        System.out.println("byte - " + maxByte);
        System.out.println("short - " + maxShort);
        System.out.println("int - " + maxInt);
        System.out.println("long - " + maxLong);
        System.out.println("char - " + (int) maxChar);

        maxByte--;
        maxShort--;
        maxInt--;
        maxLong--;
        maxChar--;

        System.out.println("\nЗначение после декремента на единицу:");
        System.out.println("byte - " + maxByte);
        System.out.println("short - " + maxShort);
        System.out.println("int - " + maxInt);
        System.out.println("long - " + maxLong);
        System.out.println("char - " + (int) maxChar);

        System.out.println("\n5. Перестановка значений переменных\n");

        int num1 = 2;
        int num2 = 5;

        System.out.println("Исходные значения переменных:");
        System.out.println("Первая переменная - " + num1);
        System.out.println("Вторая переменная - " + num2);
        
        System.out.println("\nСпособ перестановки с помощью третьей переменной:");

        int num3;
        
        num3 = num2;
        num2 = num1;
        num1 = num3;

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
        num2 = num1 ^ num2;
        num1 ^= num2;

        System.out.println("Первая переменная - " + num1);
        System.out.println("Вторая переменная - " + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char symbol1 = '$';
        char symbol2 = '*';
        char symbol3 = '@';
        char symbol4 = '^';
        char symbol5 = '~';

        System.out.println((int) symbol1 + " | " + symbol1);
        System.out.println((int) symbol2 + " | " + symbol2);
        System.out.println((int) symbol3 + " | " + symbol3);
        System.out.println((int) symbol4 + " | " + symbol4);
        System.out.println((int) symbol5 + " | " + symbol5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backSlash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';

        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis +
                                                backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash +
                                                backSlash + underscore + underscore + backSlash);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа\n");

        int number = 123;

        int hundreds = number / 100;
        int dozens = (number / 10) % 10;
        int units = (number % 100) % 10;
        int sumDigits = hundreds + dozens + units;
        int productDigits = hundreds * dozens * units;

        System.out.println("Число " + number + " содержит:");
        System.out.println("    сотен - " + hundreds);
        System.out.println("    десятков - " + dozens);
        System.out.println("    единиц - " + units);
        System.out.println("Сумма разрядов = " + sumDigits);
        System.out.println("Произведение разрядов = " + productDigits);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды\n");

        int time = 86399;
        int hour;
        int minutes;
        int seconds;

        hour = time / 3600;
        minutes = (time % 3600) / 60;
        seconds = time % 60;

        System.out.println(hour + ":" + minutes + ":" + seconds);

        System.out.println("\n10. Расчет стоимости товара со скидкой\n");

        BigDecimal penPriceBd = new BigDecimal("105.5");
        BigDecimal bookPriceBd = new BigDecimal("235.83");
        BigDecimal discountBd = new BigDecimal("0.11");

        BigDecimal totalPriceBd = penPriceBd.add(bookPriceBd);
        BigDecimal discountAmountBd = totalPriceBd.multiply(discountBd);
        BigDecimal discountPriceBd = totalPriceBd.subtract(discountAmountBd);

        System.out.println("Стоимость товаров без скидки - " + totalPriceBd + " руб.");
        System.out.println("Сумму скидки - " + discountAmountBd + " руб.");
        System.out.println("Стоимость товаров со скидкой - " + discountPriceBd + " руб.");
    }
}