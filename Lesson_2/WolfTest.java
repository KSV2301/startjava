public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "самец";
        wolf.name = "Акула";
        wolf.weight = 42.7f;
        wolf.age = 7;
        wolf.colorCoat = "коричнево-белый";

        System.out.println("Характеристики волка:");

        System.out.println("Кличка - " + wolf.name + "\nПол - " + wolf.gender + 
                "\nВес - " + wolf.weight + " кг" + "\nВозраст - " + wolf.age + " лет" +
                "\nОкрас - " + wolf.colorCoat);

        System.out.println("\nДействия волка:");

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}