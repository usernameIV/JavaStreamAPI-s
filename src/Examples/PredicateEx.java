package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateEx {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "kotlin", "python", "javascript", "C", "go","ruby");

        //Predicate<String> moreThanFiveChar = word -> word.length() > 5;
        words.stream()
                //.filter(moreThanFiveChar)
                .filter(w -> w.length() > 5)
                .forEach(System.out::println);

    }

}
