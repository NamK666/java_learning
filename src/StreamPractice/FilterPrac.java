package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterPrac {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Stream<Integer> evenStream = numbers.stream().filter(n -> n % 2 == 0);
    }
}
