package HashSetPractice;

import java.util.HashSet;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    Set<Integer> integerSet = new HashSet<>();

    integerSet.add(1);
    integerSet.add(1);
    integerSet.add(1);
    integerSet.add(1);
    System.out.println(integerSet.size());
  }
}
