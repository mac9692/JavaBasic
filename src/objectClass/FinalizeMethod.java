package objectClass;

public class FinalizeMethod {
    public static void main(String[] args) {
        Person person1 = new Person("Park");
        Person person2 = new Person("Han");

        person1 = null;
        person2 = null;

        System.gc();
        System.runFinalization();

        System.out.println("Main Method End");
    }
}
