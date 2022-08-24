package objectClass;

public class InstanceCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point original = new Point(3, 5);
        Point copy;

        copy = (Point) original.clone();
        original.showPosition();
        copy.showPosition();
    }
}
