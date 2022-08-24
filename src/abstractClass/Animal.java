package abstractClass;

public abstract class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void information() {
        System.out.println("이름은 " + name);
        System.out.println("나이는 " + age);
    }
    abstract void cry();
}
