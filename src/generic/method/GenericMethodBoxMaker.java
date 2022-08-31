package generic.method;

import generic.box.GenericBox;

public class GenericMethodBoxMaker {
    public static void main(String[] args) {
        GenericBox<String> stringGenericBox = BoxFactory.makeBox("make StringBox");
        System.out.println(stringGenericBox.getObject());

        GenericBox<Integer> integerGenericBox = BoxFactory.makeBox(25);
        System.out.println(integerGenericBox.getObject());
    }
}
