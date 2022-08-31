package generic.interfaceex;

public class BoundedInterfaceBox {
    public static void main(String[] args) {
        AppleImplBox<Apple> appleImplBox = new AppleImplBox<>();
        appleImplBox.setObject(new Apple());

        Apple apple = appleImplBox.getObject();
        System.out.println(apple);
    }
}
