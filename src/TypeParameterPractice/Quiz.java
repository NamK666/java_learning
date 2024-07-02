package TypeParameterPractice;

public class Quiz {
  public static void main(String[] args) {
    System.out.println(compareString("hello", "hello"));
  }

  public static <T extends String> String compareString(T a, T b) {
    String s1 = a.toString();
    String s2 = b.toString();
    return s1.equals(s2) ? "YES" : "NO";
  }
}
