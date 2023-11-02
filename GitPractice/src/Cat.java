import entity.Animal;

public class Cat extends Animal {
    private String name;
    private int age;
    private int weight;

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
