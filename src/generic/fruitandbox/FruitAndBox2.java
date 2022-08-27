package generic.fruitandbox;

import generic.box.Box;
import generic.fruit.Apple;
import generic.fruit.Orange;

public class FruitAndBox2 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        Box orangeBox = new Box();

        appleBox.setObject(new Apple());
        orangeBox.setObject(new Orange());

        Apple apple = (Apple) appleBox.getObject();
        Orange orange = (Orange) orangeBox.getObject();

        System.out.println(apple);
        System.out.println(orange);
    }
}
