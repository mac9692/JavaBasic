package generic;

import generic.box.GenericBox;

public class BoundedBox {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setObject(24);

        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.setObject(1.22);

        System.out.println(integerGenericBox.getObject());
        System.out.println(doubleGenericBox.getObject());
    }
}
