package ListPractice1;

import java.util.HashSet;
import java.util.Set;

public class prac5 {
  public static void main(String[] args) {
    Set<Member> memberSet = new HashSet<>();

    memberSet.add(new Member("이남경", 30));
    memberSet.add(new Member("한수빈", 26));
    memberSet.add(new Member("한수빈", 26));

    System.out.println("총 객체수: " + memberSet.size());
  }
}
