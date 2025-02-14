public class StaticMethod {
    private static String getCurrentMethodName() {
        return new Exception().getStackTrace()[1].getMethodName();
    }

    public static void staticMethod() {
        System.out.println("\n" + getCurrentMethodName() + "() -> выполнение статического метода");
    }
}