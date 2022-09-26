package streamstudy.ex2;

import java.util.Arrays;
import java.util.List;

public class MapToInt {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Box", "Park", "Han");

        stringList.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
