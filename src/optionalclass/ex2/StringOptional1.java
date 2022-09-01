package optionalclass.ex2;

import java.util.Optional;

public class StringOptional1 {
    public static void main(String[] args) {
        Optional<String> stringOptional1 = Optional.of(new String("Toy1"));
        Optional<String> stringOptional2 = Optional.ofNullable(new String("Toy2"));

        if (stringOptional1.isPresent()) {
            System.out.println(stringOptional1.get());
        }

        if (stringOptional2.isPresent()) {
            System.out.println(stringOptional2.get());
        }
    }
}
