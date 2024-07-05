package Map;

import java.util.*;

public class entrySetPrac {
  public static void main(String[] args) {
    Map<String, List<String>> map = new HashMap<>();
    List<String> strList = new ArrayList<>();

    strList.add("A");
    strList.add("A");
    strList.add("A");
    map.put("키1", strList);

    Set<Map.Entry<String, List<String>>> set = map.entrySet();

    for (Map.Entry<String, List<String>> entry : set) {
      String key = entry.getKey();
      List<String> value = entry.getValue();
    }
  }
}
