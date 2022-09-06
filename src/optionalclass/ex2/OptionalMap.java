package optionalclass.ex2;

import java.util.Optional;

public class OptionalMap {
    public static void main(String[] args) {
        Optional<String> stringOptional1 = Optional.of("Optional String");
        Optional<String> stringOptional2 = stringOptional1.map(String::toUpperCase);

        System.out.println(stringOptional2.get());

        Optional<String> stringOptional3 = stringOptional1
                .map(s -> s.replace(' ', '_'))
                .map(String::toLowerCase);

        System.out.println(stringOptional3.get());
    }
}
