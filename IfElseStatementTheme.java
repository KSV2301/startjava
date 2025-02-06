import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        boolean isMale = true;

        if (!isMale) {
            System.out.println("Она женщина!Он мужчина!");
        } else {
            System.out.println("Он мужчина!");
        }

        int age = 23;

        if (age > 18) {
            System.out.println("Совершеннолетний!");
        } else {
            System.out.println("Несовершеннолетний!");
        }

        double height = 1.83;

        if (height < 1.8) {
            System.out.println("Его рост ниже среднего!");
        } else {
            System.out.println("Его рост выше среднего!");
        }

        char nameFirstLetter = "Semen".charAt(0);

        if (nameFirstLetter == 'M') {
            System.out.println("Его зовут Максим!");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Его зовут Игорь!");
        } else {
            System.out.println("Его зовут Семен!");
        }

        System.out.println("\n2. Поиск большего числа\n");

        int num1 = 11;
        int num2 = 10;

        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " == " + num2);
        } else {
            System.out.println(num1 + " < " + num2);
        }

        System.out.println("\n3. Проверка числа\n");

        int num = 52;

        if (num == 0) {
            System.out.println(num + " является нулем");
            return;
        } else if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " является положительным и четным");
            } else {
                System.out.println(num + " является положительным и нечетным");
            }
        } else {
            if (num % 2 == 0) {
                System.out.println(num + " является отрицательным и четным");
            } else {
                System.out.println(num + " является положительным и нечетным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        int value1 = 123;
        int value2 = 223;

        int hundreds1 = value1 / 100;
        int tens1 = (value1 / 10) % 10;
        int ones1 = value1 % 10;

        int hundreds2 = value2 / 100;
        int tens2 = (value2 / 10) % 10;
        int ones2 = value2 % 10;

        if (hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2) {
            System.out.println("Одинаковые цифры есть!");
        } else {
            System.out.println("Одинаковых цифр нет!");
            return;
        }

        System.out.println("Исходные числа: " + value1 + "    " + value2);
        System.out.println("Одинаковые цифры по разрядам:");

        if (hundreds1 == hundreds2) {
            System.out.println("Сотни: " + hundreds1 + " == " + hundreds2);
        } else {
            System.out.println("Сотен нет! " + hundreds1 + "    " + hundreds2);
        }

        if (tens1 == tens2) {
            System.out.println("Десятки: " + tens1 + " == " + tens2);
        } else {
            System.out.println("Десятков нет! " + tens1 + "    " + tens2);
        }

        if (ones1 == ones2) {
            System.out.println("Единицы: " + ones1 + " == " + ones2);
        } else {
            System.out.println("Единиц нет! " + ones1 + "    " + ones2);
        }

        System.out.println("\n5. Определение символа по его коду\n");

        char ch = '\u0057';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("'" + ch + "'" + "- большая буква");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("'" + ch + "'" + "- маленькая буква буква");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("'" + ch + "'" + "- цифра");
        } else {
            System.out.println("'" + ch + "'" + "- ни буква и ни цифра");
        }

        char ch1 = '\u005E';

        if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println("'" + ch1 + "'" + "- большая буква");
        } else if (ch1 >= 'a' && ch1 <= 'z') {
            System.out.println("'" + ch1 + "'" + "- маленькая буква буква");
        } else if (ch1 >= '0' && ch1 <= '9') {
            System.out.println("'" + ch1 + "'" + "- цифра");
        } else {
            System.out.println("'" + ch1 + "'" + "- ни буква и ни цифра");
        }

        char ch2 = '\u0031';

        if (ch2 >= 'A' && ch2 <= 'Z') {
            System.out.println("'" + ch2 + "'" + "- большая буква");
        } else if (ch2 >= 'a' && ch2 <= 'z') {
            System.out.println("'" + ch + "'" + "- маленькая буква буква");
        } else if (ch2 >= '0' && ch2 <= '9') {
            System.out.println("'" + ch2 + "'" + "- цифра");
        } else {
            System.out.println("'" + ch2 + "'" + "- ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %\n");

        double deposit = 321123.59;
        double percent;

        System.out.println("Сумма вклада - " + deposit + " руб.");

        if (deposit < 100000) {
            percent = deposit * 0.05;
            deposit += percent;
            System.out.println("Сумма начисленного % - " + percent + " руб.");
            System.out.println("Итоговая сумма с % - " + deposit + " руб.");
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = deposit * 0.07;
            deposit += percent;
            System.out.println("Сумма начисленного % - " + percent + " руб.");
            System.out.println("Итоговая сумма с % - " + deposit + " руб.");
        } else {
            percent = deposit * 0.1;
            deposit += percent;
            System.out.println("Сумма начисленного % - " + percent + " руб.");
            System.out.println("Итоговая сумма с % - " + deposit + " руб.");
        } 

        System.out.println("\n7. Определение оценки по предметам\n");

        double history = 0.59;
        int scoreHis;

        if (history <= 0.60) {
            scoreHis = 2;
            System.out.println("История - " + scoreHis);
        } else if (history > 0.60 && history <= 0.73) {
            scoreHis = 3;
            System.out.println("История - " + scoreHis);
        } else if (history > 0.73 && history <= 0.91) {
            scoreHis = 4;
            System.out.println("История - " + scoreHis);
        } else {
            scoreHis = 5;
            System.out.println("История - " + scoreHis);
        }

        double programming = 0.92;
        int scoreProg;

        if (programming <= 0.60) {
            scoreProg = 2;
            System.out.println("Программирование - " + scoreProg);
        } else if (programming > 0.60 && programming <= 0.73) {
            scoreProg = 3;
            System.out.println("Программирование - " + scoreProg);
        } else if (programming > 0.73 && programming <= 0.91) {
            scoreProg = 4;
            System.out.println("Программирование - " + scoreProg);
        } else {
            scoreProg = 5;
            System.out.println("Программирование - " + scoreProg);
        }

        double gpa = (scoreHis + scoreProg) / 2.0;
        System.out.println("Средний балл оценок по предметам - " + gpa);

        double averagePercent = (history + programming) / 2.0;
        System.out.println("Средний % по предметам - " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли\n");

        double sale = 13025.233;
        double rent = 5123.018;
        double costPrice = 9001.729;

        double annualRevenue = (sale - (costPrice + rent)) * 12.0;

        if (annualRevenue > 0) {
            System.out.println("Прибыль за год: +" + annualRevenue + " руб.");
        } else if (annualRevenue == 0) {
            System.out.println("Прибыль за год: " + annualRevenue + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualRevenue + " руб.");
        }

        System.out.println("\n9. Расчет годовой прибыли с помощью BigDecimal\n");

        BigDecimal depositBd = new BigDecimal("321123.59");
        BigDecimal percentBd = new BigDecimal("0.0");

        System.out.println("Сумма вклада - " + depositBd + " руб.");

        if (depositBd.compareTo(new BigDecimal(100000)) < 0) {
            percentBd = depositBd.multiply(new BigDecimal("0.05"))
                .setScale(2, RoundingMode.HALF_UP);
            depositBd = depositBd.add(percentBd).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Сумма начисленного % - " + percentBd + " руб.");
            System.out.println("Итоговая сумма с % - " + depositBd + " руб.");
        } else if (depositBd.compareTo(new BigDecimal(100000)) >= 0 && depositBd
                .compareTo(new BigDecimal(300000)) <= 0) {
            percentBd = depositBd.multiply(new BigDecimal("0.07"))
                .setScale(2, RoundingMode.HALF_UP);
            depositBd = depositBd.add(percentBd).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Сумма начисленного % - " + percentBd + " руб.");
            System.out.println("Итоговая сумма с % - " + depositBd + " руб.");
        } else {
            percentBd = depositBd.multiply(new BigDecimal("0.1"))
                .setScale(2, RoundingMode.HALF_UP);
            depositBd = depositBd.add(percentBd).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Сумма начисленного % - " + percentBd + " руб.");
            System.out.println("Итоговая сумма с % - " + depositBd + " руб.");
        }

        System.out.println("\n10. Подсчет начисленных банком % с помощью BigDecimal\n");

        BigDecimal saleBd = new BigDecimal("13025.233");
        BigDecimal rentBd = new BigDecimal("5123.018");
        BigDecimal costPriceBd = new BigDecimal("9001.729");

        BigDecimal annualRevenueBd = saleBd.subtract(costPriceBd.add(rentBd))
                .multiply(new BigDecimal("12")).setScale(2, RoundingMode.HALF_UP);

        if (annualRevenueBd.compareTo(new BigDecimal(0)) > 0) {
            System.out.println("Прибыль за год: +" + annualRevenueBd + " руб.");
        } else if (annualRevenueBd.compareTo(new BigDecimal(0)) == 0) {
            System.out.println("Прибыль за год: " + annualRevenueBd + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualRevenueBd + " руб.");
        }
    }
}