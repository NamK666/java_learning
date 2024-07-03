package ListPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {

    Set<String> strSet = new HashSet<>();
    strSet.add("A");
    strSet.add("B");
    strSet.add("C");

    Iterator<String> strIterator = strSet.iterator();

    while (strIterator.hasNext()) {
      String element = strIterator.next();
      System.out.println(element);
    }
  }
}
