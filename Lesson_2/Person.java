public class Person {
    String gender = "мужской";
    String name = "Иван";
    float height = 180.2f;
    float weight = 79.8f;
    int age = 22;

    void move() {
        System.out.println(name + " идет");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void talk() {
        System.out.println(name + " говорит");
    }

    void learnJava() {
        System.out.println(name + " учит Java");
    }
}