package methodreferences;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Box", "Robot");
        stringList.forEach(s -> System.out.println(s));
        stringList.forEach(System.out::println);
    }
}
