package generic;

import generic.box.GenericBox;

public class PrimitivesAndGeneric {
    public static void main(String[] args) {
        GenericBox<Integer> box = new GenericBox<>();
        box.setObject(125);

        int number = box.getObject();

        System.out.println(number);
    }
}
