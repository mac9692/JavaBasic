package objectclass;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle original = new Rectangle(1, 1, 9, 9);
        Rectangle copy;

        copy = (Rectangle) original.clone();
        original.changePos(2, 2, 7, 7);
        original.showPosition();
        copy.showPosition();

        System.out.println(original);
        System.out.println(copy);
        System.out.println(original.getUpperLeft());
        System.out.println(original.getLowerRight());
        System.out.println(copy.getUpperLeft());
        System.out.println(copy.getLowerRight());
    }
}
