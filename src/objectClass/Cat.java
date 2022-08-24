package objectClass;

public class Cat implements Cloneable {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat original = new Cat("Park", 10);
        Cat copy = (Cat) original.clone();

        System.out.println(original);
        System.out.println(original.name.hashCode());
        System.out.println(copy);
        System.out.println(copy.name.hashCode());
    }
}
