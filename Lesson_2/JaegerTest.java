public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setOrigin("USA");
        jaeger1.setSpeed(7);
        jaeger1.setStrength(8);
        jaeger1.setArmor(9);
        jaeger1.desplayInfo();

        Jaeger jaeger2 = new Jaeger("Cherno Alpha", "Russia", 3, 10, 10);
        jaeger2.desplayInfo();
    }
}