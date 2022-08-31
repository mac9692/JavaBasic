package generic.method;

import generic.box.GenericBox;

public class BoxFactory {
    public static <T>GenericBox<T> makeBox(T object) {
        GenericBox<T> genericBox = new GenericBox<>();
        genericBox.setObject(object);
        return genericBox;
    }
}
