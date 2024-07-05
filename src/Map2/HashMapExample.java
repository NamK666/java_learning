package Map2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();

    map.put("카리나", 7);
    map.put("닝닝", 8);
    map.put("이남경", 10);
    System.out.println("총 Entry 수 : " + map.size());

    // 객체 찾기
    System.out.println("\t카리나 " + map.get("카리나"));

    // 객체를 하나씩 처리하기.
    Set<String> keySet = map.keySet();
    Iterator<String> iterator = keySet.iterator();
    while (iterator.hasNext()) {
      String key = iterator.next();
      Integer value = map.get(key);
      System.out.println("\t " + key + ": " + value);
    }
  }
}
