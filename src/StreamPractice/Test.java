package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
  public static void main(String[] args) {
    /*
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3));
    Stream<Integer> stream = numbers.stream(); // numbers를 stream화 시켰다.
    */

    /*
    int[] array = {1,2,3,4,5,6,7,8,9};
    IntStream intStream = Arrays.stream(array);
    */

    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
  }
}
