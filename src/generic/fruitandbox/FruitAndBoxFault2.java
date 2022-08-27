package generic.fruitandbox;

import generic.box.Box;

public class FruitAndBoxFault2 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        Box orangeBox = new Box();

        appleBox.setObject("Apple");
        orangeBox.setObject("Orange");

        System.out.println(appleBox.getObject());
        System.out.println(orangeBox.getObject());
    }
}
