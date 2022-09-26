package streamstudy.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfStream {
    public static void main(String[] args) {
        Stream.of(11, 22, 33, 44)
                .forEach(System.out::println);

        Stream.of("Park", "Han")
                .forEach(System.out::println);


        List<String> stringList = Arrays.asList("Park", "Han", "Hong");
        stringList.forEach(System.out::println);
    }
}
