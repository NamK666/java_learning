package Map;

import java.util.*;
import java.util.Map.Entry;

public class Test {
  public static void main(String[] args) {
    Map<String, List<String>> map = new HashMap<>(); // string타입의 키만 가져야하고, 값은 integer타입만 가져야함.
    List<String> stringList = new ArrayList<>();

    stringList.add("홍길동");
    stringList.add("홍길동");
    stringList.add("홍길동");
    map.put("키1", stringList);

    Set<Entry<String, List<String>>> entries = map.entrySet();

    for (Entry<String, List<String>> entry : entries) {
      String key = entry.getKey(); // key추출
      List<String> value = entry.getValue(); // value추출
    }
  }
}
