package abstractClass;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void cry() {
        System.out.println("멍멍");
    }
}
