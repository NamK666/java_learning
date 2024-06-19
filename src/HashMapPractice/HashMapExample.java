package HashMapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
  public static void main(String[] args) {

    // 1. Map 컬렉션 생성하기
    Map<String, Integer> map = new HashMap<>();

    map.put("홍길동", 80);
    map.put("카리나", 85);
    map.put("제시카", 95);
    map.put("홍길동", 90); // 키가 "홍길동"으로 같기 때문에, 마지막꺼로 덮어씌워짐.
    System.out.println("총 Entry 수: " + map.size()); // 총 Entry 수: 3

    // 2. 객체 찾기
    System.out.println("\t홍길동 " + map.get("홍길동"));
    System.out.println("------------------");
    // 3. 객체를 하나씩 처리하기
    Set<String> keySet = map.keySet();
    Iterator<String> iterator = keySet.iterator();
    while (iterator.hasNext()) {
      String key = iterator.next();
      Integer value = map.get(key);
      System.out.println("\t" + key + ": " + value);
    }
    System.out.println("------------------");

    // 4. 객체 삭제하기
    map.remove("홍길동");
    System.out.println("삭제 후, 총 Entry 수: " + map.size());

    // 5. 모든 Map.Entry 삭제하기
    map.clear();

  }
}
