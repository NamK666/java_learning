package ListPractice1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class prac2 {
  public static void main(String[] args) {

    Set<String> strSet = new HashSet<>();
    strSet.add("hey");
    strSet.add("hi");
    strSet.add("hello");

    for (String str : strSet){
      System.out.println(str);
    }
  }
}
