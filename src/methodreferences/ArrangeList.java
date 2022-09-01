package methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 7, 9);
        integerList = new ArrayList<>(integerList);

        Consumer<List<Integer>> consumer = list -> Collections.reverse(list);
        consumer.accept(integerList);
        System.out.println(integerList);
    }

}
