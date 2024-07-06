package Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaTest {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

    numbers.removeIf((integer) -> integer % 2 == 0);

    System.out.println(numbers);
  }
}
