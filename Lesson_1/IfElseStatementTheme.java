import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        boolean isMale = true;

        if (!isMale) {
            System.out.println("Она женщина!");
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
        } else {
            System.out.print(num + " является ");

            if (num > 0) {
                System.out.print("положительным");
            } else {
                System.out.print("отрицательным");
            }

            System.out.print(" и ");

            if (num % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        num1 = 123;
        num2 = 223;

        int hundreds1 = num1 / 100;
        int tens1 = (num1 / 10) % 10;
        int ones1 = num1 % 10;

        int hundreds2 = num2 / 100;
        int tens2 = (num2 / 10) % 10;
        int ones2 = num2 % 10;

        if (hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2) {
            System.out.println("Одинаковые цифры есть!");
            System.out.println("Исходные числа: " + num1 + "    " + num2);
            System.out.println("Одинаковые цифры по разрядам:");
            
            if (hundreds1 == hundreds2) {
                System.out.println("Сотни: " + hundreds1);
            }
            if (tens1 == tens2) {
                System.out.println("Десятки: " + tens1);
            } 
            if (ones1 == ones2) {
                System.out.println("Единицы: " + ones1);
            }
        } else {
            System.out.println("Одинаковых цифр нет!");
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

        System.out.println("\n6. Подсчет начисленных банком %\n");

        double deposit = 9999;
        double percent = 0.05;

        System.out.println("Сумма вклада - " + deposit + " руб.");

        if (deposit >= 100000 && deposit <= 300000) {
            percent = 0.07;
        } else if (deposit > 300000) {
            percent = 0.1;
        }

        double accruedInterest = percent * deposit;
        double finalSum = deposit + accruedInterest;

        System.out.println("Сумма начисленного % - " + accruedInterest + " руб.");
        System.out.println("Итоговая сумма с % - " + finalSum + " руб.");

        System.out.println("\n7. Определение оценки по предметам\n");

        double historyPercent = 0.59;
        int historyGrade = 2;

        if (historyPercent > 0.60 && historyPercent <= 0.73) {
            historyGrade = 3;
        } else if (historyPercent > 0.73 && historyPercent <= 0.91) {
            historyGrade = 4;
        } else if (historyPercent > 0.91) {
            historyGrade = 5;
        }

        double programmingPercent = 0.92;
        int programmingGrade = 2;

        if (programmingPercent > 0.60 && programmingPercent <= 0.73) {
            programmingGrade = 3;
        } else if (programmingPercent > 0.73 && programmingPercent <= 0.91) {
            programmingGrade = 4;
        } else if (programmingPercent > 0.91) {
            programmingGrade = 5;
        }

        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercent = (historyPercent + programmingPercent) / 2.0;

        System.out.println("Оценка по истории - " + historyGrade);
        System.out.println("Оценка по программированию - " + programmingGrade);
        System.out.println("Средний балл оценок по предметам - " + averageGrade);
        System.out.println("Средний % по предметам - " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли\n");

        double sale = 13025.233;
        double rent = 5123.018;
        double costPrice = 9001.729;

        double annualRevenue = (sale - (costPrice + rent)) * 12.0;

        if (annualRevenue > 0) {
            System.out.println("Прибыль за год: +" + annualRevenue + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualRevenue + " руб.");
        }

        System.out.println("\n9. Расчет годовой прибыли с помощью BigDecimal\n");

        BigDecimal depositBd = new BigDecimal("321123.59");
        BigDecimal percentBd = new BigDecimal("0.05");

        System.out.println("Сумма вклада - " + depositBd + " руб.");

        if (depositBd.compareTo(BigDecimal.valueOf(100000)) >= 0 && 
                depositBd.compareTo(BigDecimal.valueOf(300000)) <= 0) {
            percentBd = new BigDecimal("0.07");
        } else {
            percentBd = new BigDecimal("0.1");
        }

        BigDecimal accruedInterestBd = depositBd.multiply(percentBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal finalSumBd = depositBd.add(percentBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма начисленного % - " + accruedInterestBd + " руб.");
        System.out.println("Итоговая сумма с % - " + finalSumBd + " руб.");

        System.out.println("\n10. Подсчет начисленных банком % с помощью BigDecimal\n");

        BigDecimal saleBd = new BigDecimal("13025.233");
        BigDecimal rentBd = new BigDecimal("5123.018");
        BigDecimal costPriceBd = new BigDecimal("9001.729");

        BigDecimal annualRevenueBd = saleBd.subtract(costPriceBd.add(rentBd))
                .multiply(BigDecimal.valueOf(12)).setScale(2, RoundingMode.HALF_UP);

        if (annualRevenueBd.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: +" + annualRevenueBd + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualRevenueBd + " руб.");
        }
    }
}