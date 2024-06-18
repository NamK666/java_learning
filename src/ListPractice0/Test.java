package ListPractice0;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Spring");
    arrayList.add("Servlet/JSP");
    arrayList.add("DBMS");
    arrayList.add("JPA");

    System.out.println("총 객체수: " + arrayList.size());

    System.out.println("==============");

    System.out.println("2번째 인덱스: " + arrayList.get(2));

    // foreach문 활용한 출력
    for(String str : arrayList){
      System.out.println(str);
    }

    // 대소문자 구분
    System.out.println(arrayList.contains("Java")); // true
    System.out.println(arrayList.contains("java")); // false

    // null값도 값이다.
    ArrayList<Object> objects = new ArrayList<>();
    objects.add(null);
    System.out.println(objects.isEmpty()); // false (null값도 값이기때문에)

    // clear을 통한 배열 비우기.
    objects.clear();
    System.out.println(objects.isEmpty()); // true
  }
}
