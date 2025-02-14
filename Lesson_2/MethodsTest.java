public class MethodsTest {
    public static void main(String[] args) {
        System.out.println("Статический метод: ");
        
        StaticMethod.staticMethod();

        System.out.println("\n----------------------------------\n");
        System.out.println("Не boolean-методы: ");

        NonBooleanMethods nbm = new NonBooleanMethods();

        nbm.findLongestWord();
        nbm.selectMenuItem();
        nbm.calculateAverageGrade();
        nbm.countUniqueWords();
        nbm.showErrorMessage();
        nbm.syncWithCloud();
        nbm.restoreBackup();
        nbm.pauseMP3Download();
        nbm.resetVacuumSettings();
        nbm.writeToFile();
        nbm.convertTempToF();
        nbm.solveMathExpression();
        nbm.findRaceWinner();
        nbm.findBook();

        System.out.println("\n----------------------------------\n");
        System.out.println("boolean-методы ");

        BooleanMethods bm = new BooleanMethods();

        bm.isProgramRunning();
        bm.isFileDeleted();
        bm.hasUniqueDigit();
        bm.isValidInput();
        bm.hasEqualDigits();
        bm.hasMarioLives();
        bm.isOnlySpaces();
        bm.isCubeEven();
        bm.isSsdFileValid();
        bm.doesFileExist();
    }
}