public class BooleanMethods {
    private String getCurrentMethodName() {
        return new Exception().getStackTrace()[1].getMethodName();
    }

    public boolean isProgramRunning() {
        System.out.print("\n" + getCurrentMethodName() + 
                "() -> программа выполняется далее или завершается? " + false);
        return false;
    }

    public boolean isFileDeleted() {
        System.out.print("\n" + getCurrentMethodName() + 
                "() -> удалился ли файл на жестком диске или флешке? " + true);
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print("\n" + getCurrentMethodName() + 
                "() -> последовательность содержит уникальную цифру? " + false);
        return false;
    }

    public boolean isValidInput() {
        System.out.print("\n" + getCurrentMethodName() + 
                "() -> пользователь ввел букву или что-то другое? " + true);
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print("\n" + getCurrentMethodName() + 
                "() -> в проверяемых числах, есть равные цифры? " + false);
        return false;
    }

    public boolean hasMarioLives() {
        System.out.print("\n" + getCurrentMethodName() + 
                "() -> в игре 'Марио' остались попытки? " + true);
        return true;
    }

    public boolean isOnlySpaces() {
        System.out.print("\n" + getCurrentMethodName() + 
                "() -> пользователь ввёл пустую строку или из одних пробелов? " + false);
        return false;
    }

    public boolean isCubeEven() {
        System.out.print("\n" + getCurrentMethodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число? " + true);
        return true;
    }

    public boolean isSsdFileValid() {
        System.out.print("\n" + getCurrentMethodName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный? " + false);
        return false;
    }

    public boolean doesFileExist() {
        System.out.print("\n" + getCurrentMethodName() +
                "() -> файл по указанному адресу существует? " + true);
        return true;
    }
}