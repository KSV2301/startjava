package com.startjava.lesson_2_3.method.naming;

public class NonBooleanMethods {
    public void findLongestWord() {
        System.out.println("\n" + MethodUtils.getName() + 
                "() -> найти самое длинное слово в предложении из книги по Java");
    }

    public void selectMenuItem() {
        System.out.println(MethodUtils.getName() + 
                "() -> выбрать пункт меню в текстовом редакторе на macOS");
    }

    public void calculateAverageGrade() {
        System.out.println(MethodUtils.getName() + 
                "() -> вычислить среднее значение оценок в школе №1234");
    }

    public void countUniqueWords() {
        System.out.println(MethodUtils.getName() + 
                "() -> подсчитать количество уникальных слов в 'Война и Мир'");
    }

    public void showErrorMessage() {
        System.out.println(MethodUtils.getName() + "() -> вывести сообщение об ошибке");
    }

    public void syncWithCloud() {
        System.out.println(MethodUtils.getName() + 
                "() -> синхронизировать данные с облачным хранилищем");
    }

    public void restoreBackup() {
        System.out.println(MethodUtils.getName() + 
                "() -> восстановить данные из резервной копии от 11.03.2024");
    }

    public void pauseDownload() {
        System.out.println(MethodUtils.getName() + 
                "() -> приостановить загрузку mp3-файла группы 'Ария'");
    }

    public void resetVacuumSettings() {
        System.out.println(MethodUtils.getName() + 
                "() -> сбросить настройки до заводских для пылесоса Mi");
    }

    public void writeToFile() {
        System.out.println(MethodUtils.getName() + 
                "() -> записать содержимое в файл по указанному пути на флешку");
    }

    public void toFahrenheit() {
        System.out.println(MethodUtils.getName() + 
                "() -> преобразовать температуру из Цельсия в Фаренгейт");
    }

    public void solveMathExpression() {
        System.out.println(MethodUtils.getName() + 
                "() -> ввести математическое выражение с тремя аргументами");
    }

    public void findRaceWinner() {
        System.out.println(MethodUtils.getName() + 
                "() -> выявить победителя среди гонщиков игры 'Need For Speed'");
    }

    public void findBookByAuthor() {
        System.out.println(MethodUtils.getName() + 
                "() -> найти книгу по имени писателя");
    }
}