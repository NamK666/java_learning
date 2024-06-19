package HashSetPractice2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {
    Set<String> stringSet = new HashSet();
    stringSet.add("Java");
    stringSet.add("Spring");
    stringSet.add("Servlet/JSP");
    stringSet.add("Java");
    stringSet.add("DBMS");

    System.out.println("총 객체 수: " + stringSet.size());

    Iterator strIterator = stringSet.iterator();

    while (strIterator.hasNext()) {
      String element = (String) strIterator.next();
      System.out.println(element);
    }

    stringSet.remove("DBMS");
    stringSet.remove("Java");
    System.out.println("삭제 후의 총 객체 수: " + stringSet.size());
    for (String element : stringSet) {
      System.out.println(element);
    }

    stringSet.clear();
    if(stringSet.isEmpty()){
      System.out.println("비어있음.");
    }
  }
}
