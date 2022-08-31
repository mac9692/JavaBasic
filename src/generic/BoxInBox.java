package generic;

import generic.box.GenericBox;

public class BoxInBox {
    public static void main(String[] args) {
        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setObject("String Object");

        GenericBox<GenericBox<String>> wrapperBox = new GenericBox<>();
        wrapperBox.setObject(stringGenericBox);

        GenericBox<GenericBox<GenericBox<String>>> superWrapperBox = new GenericBox<>();
        superWrapperBox.setObject(wrapperBox);

        System.out.println(superWrapperBox.getObject().getObject().getObject());
    }
}
