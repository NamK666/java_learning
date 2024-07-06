package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortedPrac {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(3, 1, 4, 5, 6, 8, 2);
        Stream<Integer> numbersStream = numbers.stream().sorted();
        numbersStream.forEach(System.out::println);
    }
}
