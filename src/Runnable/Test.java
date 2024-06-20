package Runnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> oddNum =
        numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
    System.out.println("홀수: " + oddNum);

    numbers.stream()
        .filter(integer -> integer % 2 == 1)
        .forEach(integer -> System.out.println(integer));


  }
}
