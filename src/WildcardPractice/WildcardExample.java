package WildcardPractice;

import java.util.Arrays;
import java.util.List;

public class WildcardExample {
  public static void printList(List<?> list) {
    for (Object item : list) {
      System.out.println(item);
    }
  }

  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(1, 2, 3);
    List<String> strList = Arrays.asList("a", "b", "c");

    printList(strList);
    printList(intList);
  }
}
