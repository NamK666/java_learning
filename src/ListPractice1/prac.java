package ListPractice1;

import java.util.ArrayList;
import java.util.List;

public class prac {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("대한");
    list.add("민국");
    list.add("만세");

    for (String str : list) {
      System.out.println(str);
    }
  }
}
