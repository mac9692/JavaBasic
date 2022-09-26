package streamstudy.ex3;

import java.util.stream.Stream;

public class ConCateStringStream {
    public static void main(String[] args) {
        Stream<String> stringStream1 = Stream.of("Han", "Park", "Hong");
        Stream<String> stringStream2 = Stream.of("Kim", "Jung", "Jun");

        Stream.concat(stringStream1, stringStream2)
                .forEach(System.out::println);
    }
}
