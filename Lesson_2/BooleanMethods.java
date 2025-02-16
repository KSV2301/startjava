public class BooleanMethods {
    public boolean isProgramRunning() {
        System.out.print(MethodUtils.getCurrentMethodName() + 
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean isFileDeleted() {
        System.out.print(MethodUtils.getCurrentMethodName() + 
                "() -> удалился ли файл на жестком диске или флешке? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(MethodUtils.getCurrentMethodName() + 
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isValidInput() {
        System.out.print(MethodUtils.getCurrentMethodName() + 
                "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(MethodUtils.getCurrentMethodName() + 
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasMarioLives() {
        System.out.print(MethodUtils.getCurrentMethodName() + 
                "() -> в игре 'Марио' остались попытки? ");
        return true;
    }

    public boolean isOnlySpaces() {
        System.out.print(MethodUtils.getCurrentMethodName() + 
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean isCubeEven() {
        System.out.print(MethodUtils.getCurrentMethodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isSsdFileValid() {
        System.out.print(MethodUtils.getCurrentMethodName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean doesFileExist() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}