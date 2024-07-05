package Map2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    map.put("spring", "qwer");
    map.put("summer", "qwer1234");
    map.put("fall", "qwer123");
    map.put("winter", "qwer123");

    /*
        System.out.println(map.get("fall"));
    */

    while (true) {
      System.out.println("아이디와 비밀번호를 입력하세요.");
      System.out.println("아이디: ");
      String id = scanner.nextLine();

      System.out.println("비밀번호: ");
      String password = scanner.nextLine();

      if (map.containsKey(id)) {
        String mapPassword = map.get(id);

        if (mapPassword.equals(password)) {
          System.out.println("로그인에 성공했습니다.");
          break;
        } else {
          System.out.println("비밀번호가 틀렸습니다.");
        }
      } else {
        System.out.println("해당 아이디는 존재하지 않습니다.");
      }
    }
  }
}
