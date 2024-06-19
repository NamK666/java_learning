package HashSetPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    Set<Integer> integerSet = new HashSet<>();

    integerSet.add(1);
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(4);

    Iterator<Integer> iterator = integerSet.iterator();

    for (Integer forInt : integerSet) {
      System.out.println(forInt);
    }


  }
}
