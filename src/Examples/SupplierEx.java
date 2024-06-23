package Examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class SupplierEx {

    public static void main(String[] args) {

        Supplier<String> greets = () -> "Hello, welcome! ";
        List<String> greetingList = Stream.generate(greets)
                .limit(5)
                .toList(); {
            greetingList.forEach(System.out::println);
        }
    }

}
