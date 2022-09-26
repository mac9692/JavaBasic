package streamstudy.ex3;

import java.util.stream.Stream;

public class InstSortedStream {
    public static void main(String[] args) {
        Stream.of("Zoo", "Box", "Cat", "Dog")
                .sorted()
                .forEach(System.out::println);

        System.out.println("===========");

        Stream.of("PAAAA", "Caat", "BSDSEWEDQWD", "DD")
                .sorted((str1, str2) -> str2.length() - str1.length())
                .forEach(System.out::println);
    }
}
