public class MethodsTest {
    public static void main(String[] args) {
        MethodsTest test = new MethodsTest();
        test.testNonBooleanMethods();
        test.testBooleanMethods();
    }

    private void testNonBooleanMethods() {
        NonBooleanMethods nbm = new NonBooleanMethods();
        nbm.findLongestWord();
        nbm.selectMenuItem();
        nbm.calculateAverageGrade();
        nbm.countUniqueWords();
        nbm.showErrorMessage();
        nbm.syncWithCloud();
        nbm.restoreBackup();
        nbm.pauseMp3Download();
        nbm.resetVacuumSettings();
        nbm.writeToFile();
        nbm.convertTempToF();
        nbm.solveMathExpression();
        nbm.findRaceWinner();
        nbm.findBook();
    }

    private void testBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isProgramRunning());
        System.out.println(bm.isFileDeleted());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasLives());
        System.out.println(bm.isBlank());
        System.out.println(bm.isCubeEven());
        System.out.println(bm.isFileValid());
        System.out.println(bm.isExist());
    }
}