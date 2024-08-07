package WildcardPractice;

import java.util.Arrays;
import java.util.List;

public class WildcardExample2 {
  public static double sumOfList(List<? extends Number> list) {
    double sum = 0.0;
    for (Number n : list) {
      sum += n.doubleValue();
    }
    return sum;
  }

  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(1, 2, 3);
    List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

    System.out.println("Sum of intList: " + sumOfList(intList));
    System.out.println("Sum of doubleList: " + sumOfList(doubleList));
  }
}
