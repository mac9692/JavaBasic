package streamstudy.ex1;

import java.util.Arrays;

public class DoubleStream {
    public static void main(String[] args) {
        double[] doubles = {1.1, 1.2, 1.3, 1.4, 1.5};

        Arrays.stream(doubles)
                .forEach(System.out::println);

        System.out.println("=====");

        Arrays.stream(doubles, 1, 4)
                .forEach(System.out::println);
    }
}
