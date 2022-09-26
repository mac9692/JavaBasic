package streamstudy.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStringStream {
    public static void main(String[] args) {
        String[] words = {"Hello", "Park", "Han", "Hong"};
        Stream<String> stringStream = Arrays.stream(words);

        List<String> stringList = stringStream.filter(s -> s.length() > 3)
                .collect(Collectors.toList());
    }
}
