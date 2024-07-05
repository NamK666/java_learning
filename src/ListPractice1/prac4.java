package ListPractice1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class prac4 {
  public static void main(String[] args) {
    Set<String> strSet = new HashSet<>();
    strSet.add("Java");
    strSet.add("Spring");
    strSet.add("JSP");
    strSet.add("Java");
    strSet.add("DBMS");

    System.out.println(strSet.size()); // 4

    strSet.remove("Java");
    System.out.println("제거 후의 사이즈: " + strSet.size()); // 3

    /*
    Iterator<String> iterator = strSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
*/
    for (String str : strSet) {
      System.out.println(str);
    }

  }
}
