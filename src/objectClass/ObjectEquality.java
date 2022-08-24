package objectClass;

public class ObjectEquality {
    public static void main(String[] args) {
        INum num1 = new INum(10);
        INum num2 = new INum(20);
        INum num3 = new INum(10);

        if (num1.equals(num2)) {
            System.out.println("num1 = num2");
        } else {
            System.out.println("num1 != num2");
        }

        if (num1.equals(num3)) {
            System.out.println("num1 = num3");
        } else {
            System.out.println("num1 != num3");
        }
    }
}
