package generic;

import generic.box.DoubleBox;

public class MultiParameter {
    public static void main(String[] args) {
        DoubleBox<String, Integer> box = new DoubleBox<>();
        box.setLeftAndRight("Apple", 26);
        System.out.println(box);
    }
}
