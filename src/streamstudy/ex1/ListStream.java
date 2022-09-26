package streamstudy.ex1;

import java.util.Arrays;
import java.util.List;

public class ListStream {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Park", "Han", "Hong");

        stringList.forEach(System.out::println);
    }
}
