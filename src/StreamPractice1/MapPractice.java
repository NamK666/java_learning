package StreamPractice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapPractice {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    Stream<Integer> squaredStream = numbers.stream().map(n -> n * n);
    squaredStream.forEach(System.out::println);
  }
}
