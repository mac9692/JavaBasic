package abstractclass;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Park", 11);
        Animal cat = new Cat("Han", 10);

        dog.information();
        cat.information();

        dog.cry();
        cat.cry();
    }
}
