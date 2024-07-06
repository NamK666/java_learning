package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapPrac {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    Stream<Integer> squaredStream = numbers.stream().map(num -> num * num);
    squaredStream.forEach(System.out::println);
  }
}
