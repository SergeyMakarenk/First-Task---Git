import entity.Animal;

public class Dog extends Animal {
    private String name;
    private int age;
    private int weight;

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", weight=" + weight +
               '}';
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
