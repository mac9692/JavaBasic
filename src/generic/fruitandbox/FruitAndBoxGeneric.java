package generic.fruitandbox;

import generic.box.GenericBox;
import generic.fruit.Apple;
import generic.fruit.Orange;

public class FruitAndBoxGeneric {
    public static void main(String[] args) {
        GenericBox<Apple> appleBox = new GenericBox<>();
        GenericBox<Orange> orangeBox = new GenericBox<>();

        appleBox.setObject(new Apple());
        orangeBox.setObject(new Orange());

        Apple apple = appleBox.getObject();
        Orange orange = orangeBox.getObject();

        System.out.println(apple);
        System.out.println(orange);
    }
}
