package forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(i -> System.out.println(i));

        List<String> games = new ArrayList<String>();
        games.add("ring ball");
        games.add("kabbadi");
        games.add("football");
        games.add("volley ball");

        games.forEach(string -> System.out.println(string));



    }
}
