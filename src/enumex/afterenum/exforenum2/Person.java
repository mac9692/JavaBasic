package enumex.afterenum.exforenum2;

public enum Person {
    MAN(29),
    WOMAN(25);

    int age;

    Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }
}
