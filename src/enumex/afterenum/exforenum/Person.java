package enumex.afterenum.exforenum;

public class Person {
    public static final Person MAN = new Person();
    public static final Person WOMAN = new Person();

    @Override
    public String toString() {
        return "I am Person";
    }
}
