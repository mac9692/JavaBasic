package generic.fruitandbox;

import generic.box.AppleBox;
import generic.box.OrangeBox;
import generic.fruit.Apple;
import generic.fruit.Orange;

public class FruitAndBox {
    public static void main(String[] args) {
        AppleBox appleBox = new AppleBox();
        OrangeBox orangeBox = new OrangeBox();

        appleBox.setApple(new Apple());
        orangeBox.setOrange(new Orange());

        Apple apple = appleBox.getApple();
        Orange orange = orangeBox.getOrange();

        System.out.println(apple);
        System.out.println(orange);
    }
}
