package Map2;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();

    map.put("카리나", 7);
    map.put("닝닝", 8);
    map.put("이남경", 10);
    System.out.println("총 Entry 수 : " + map.size());

    // 객체 찾기
    System.out.println("\t카리나 " + map.get("카리나"));
  }
}
