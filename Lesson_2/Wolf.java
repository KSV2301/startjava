public class Wolf {
    String gender;
    String name;
    float weight;
    int age;
    String colorCoat;

    void walk() {
        System.out.println(name + " идет");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void howl() {
        System.out.println(name + " воет");
    }

    void hunt() {
        System.out.println(name + " охотится");
    }
}