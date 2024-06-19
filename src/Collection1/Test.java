package Collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    Set<String> stringSet = new HashSet<>();

    stringSet.add("Java");
    stringSet.add("Spring");
    stringSet.add("JSP");
    stringSet.add("Java");
    stringSet.add("DBMS");

    System.out.println(stringSet.size()); // 4

    stringSet.remove("Java");
    System.out.println(stringSet.size()); // 3

    Iterator<String> iterator = stringSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next()); // JSP, DBMS, SPRING (순서가 바뀜)
    }



    stringSet.clear(); // 싹다 지우기.

    if(stringSet.isEmpty()){
      System.out.println("비었습니다.");
    }else{
      System.out.println("비지 않았습니다.");
    }

  }
}
