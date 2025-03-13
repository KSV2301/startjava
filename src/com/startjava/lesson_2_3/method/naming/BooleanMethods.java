package com.startjava.lesson_2_3.method.naming;

public class BooleanMethods {
    public boolean isProgramRunning() {
        System.out.print(MethodUtils.getName() + 
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean isFileDeleted() {
        System.out.print(MethodUtils.getName() + 
                "() -> удалился ли файл на жестком диске или флешке? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(MethodUtils.getName() + 
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isLetter() {
        System.out.print(MethodUtils.getName() + 
                "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(MethodUtils.getName() + 
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasLives() {
        System.out.print(MethodUtils.getName() + 
                "() -> в игре 'Марио' остались попытки? ");
        return true;
    }

    public boolean isBlank() {
        System.out.print(MethodUtils.getName() + 
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean isCubeEven() {
        System.out.print(MethodUtils.getName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidFile() {
        System.out.print(MethodUtils.getName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isExist() {
        System.out.print(MethodUtils.getName() +
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}