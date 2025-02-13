public class Jaeger {
    private String modelName;
    private String origin;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String modelName, String origin, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.origin = origin;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void desplayInfo() {
        System.out.println("\nМодель: " + modelName);
        System.out.println("Происхождение: " + origin);
        System.out.println("Скорость: " + speed);
        System.out.println("Сила: " + strength);
        System.out.println("Броня: " + armor);
    }
}