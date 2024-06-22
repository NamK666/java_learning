package GenericMethod;

public class GenericMethodExample {
  public static void main(String[] args) {
    Box<Integer> box = Util.boxing(100);
    int intValue = box.get();
    System.out.println("정수값: " + intValue);

    Box<String> box2 = Util.boxing("홍길동");
    String stringValue = box2.get();
    System.out.println("문자값: " + stringValue);
  }
}
