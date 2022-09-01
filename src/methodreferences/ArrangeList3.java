package methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList3 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 7, 9);
        integerList = new ArrayList<>(integerList);
        JustSort justSort = new JustSort();

        Consumer<List<Integer>> consumer = justSort::sort;
        consumer.accept(integerList);
        System.out.println(integerList);
    }
}
