package collectionframework.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("list의 크기는 " + list.size());
        System.out.println("list의 저장 내용은 " + list);
        list.remove(0);
        list.remove(0);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
