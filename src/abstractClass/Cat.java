package abstractClass;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void cry() {
        System.out.println("야옹");
    }
}
