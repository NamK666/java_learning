package Map;

import java.util.HashMap;
import java.util.Map;

public class prac {
  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();
    map.put("이남경", 30);
    map.put("한수빈", 26);

    int namAge = map.get("이남경");
    System.out.println("남경이의 나이: " + namAge);

    map.remove("한수빈");

  }
}
