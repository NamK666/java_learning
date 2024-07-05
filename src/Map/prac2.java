package Map;

import java.util.*;

public class prac2 {
  public static void main(String[] args) {
    Map<String, List<String>> map = new HashMap<>();
    List<String> strList = new ArrayList<>();

    strList.add("홍길동");
    strList.add("홍길동");
    strList.add("홍길동");
    map.put("홍길동", strList);

    Set<String> strings = map.keySet();
    Iterator<String> iterator = strings.iterator();

    while (iterator.hasNext()) {
      String str = iterator.next();
      List<String> list = map.get(str);
      System.out.println(str);
    }
  }
}
