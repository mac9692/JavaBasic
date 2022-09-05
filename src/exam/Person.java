package exam;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void breath() {
        System.out.println("숨쉬기");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
