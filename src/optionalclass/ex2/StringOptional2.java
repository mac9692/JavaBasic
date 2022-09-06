package optionalclass.ex2;

import java.util.Optional;

public class StringOptional2 {
    public static void main(String[] args) {
        Optional<String> stringOptional1 = Optional.of(new String("Toy1"));
        Optional<String> stringOptional2 = Optional.ofNullable(new String("Toy2"));

        stringOptional1.ifPresent(System.out::println);
        stringOptional2.ifPresent(System.out::println);
    }
}
