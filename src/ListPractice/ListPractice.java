package ListPractice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
  public static void main(String[] args) {

    List<String> strList = new ArrayList<String>();
    strList.add("홍길동");
    strList.add(1, "삼길동");
    strList.add("사길동");

    for(int i=0; i<strList.size(); i++){
      String str= strList.get(i);
      System.out.println(str);
    }
  }
}
