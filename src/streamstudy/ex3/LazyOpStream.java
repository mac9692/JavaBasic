package streamstudy.ex3;

import java.util.stream.IntStream;

public class LazyOpStream {
    public static void main(String[] args) {
        IntStream.of(1, 3, 5, 6, 7, 8)
                .peek(System.out::println)
                .forEach(System.out::println);

        System.out.println("========");

        int sum = IntStream.of(1, 2, 3, 4, 5, 6, 7)
                .peek(System.out::println)
                .sum();
    }
}
