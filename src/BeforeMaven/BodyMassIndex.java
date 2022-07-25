package BeforeMaven;

public class BodyMassIndex {
    private static final double KILOGRAM_PER_POUND = 0.45359237;
    private  String name;
    private int age;
    private double weight;
    private double height;

    public BodyMassIndex(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
//    public BodyMassIndex(String name, double weight, double height){
//        this(name, 20, weight, height);
//    }
//     public String getBodyMassIndex(){
//        double bmi =weight * KILOGRAM_PER_POUND ;
//     }
//     return

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
