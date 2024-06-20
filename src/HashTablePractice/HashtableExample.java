package HashTablePractice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
  public static void main(String[] args) {
    Map<String, String> map = new Hashtable<>();
    map.put("spring", "qwer");
    map.put("summer", "qwer1234");
    map.put("fall", "qwer123");
    map.put("winter", "qwe123");

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("아이디와 비밀번호를 입력해주세요.");
      System.out.println("아이디: ");
      String id = scanner.nextLine();

      System.out.println("비밀번호: ");
      String pw = scanner.nextLine();

      if (map.containsKey(id)) {
        if (map.get(id).equals(pw)) {
          System.out.println("로그인이 되었습니다.");
          break;
        } else {
          System.out.println("비밀번호가 일치하지 않습니다.");
        }
      } else {
        System.out.println("아이디가 존재하지 않습니다.");
      }
    }
  }
}
