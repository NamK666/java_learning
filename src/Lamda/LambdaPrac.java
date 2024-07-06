package Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaPrac {

  /*
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    numbers.removeIf(n -> n % 2 == 0);
    System.out.println(numbers);
  }
   */

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    Iterator<Integer> iterator = numbers.iterator();
    while (iterator.hasNext()) {
      Integer number = iterator.next();
      if (number % 2 == 0) {
        iterator.remove();
      }
    }
    System.out.println(numbers);
  }
}
