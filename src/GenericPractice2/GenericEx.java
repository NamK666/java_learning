package GenericPractice2;

public class GenericEx {
  public static void main(String[] args) {
    Box<String> stringBox = new Box<>();
    stringBox.set("happy");

    String string = stringBox.get();
    System.out.println(string);

    Box<Integer> intBox = new Box<>();
    intBox.set(100);

    int integer = intBox.get();
    System.out.println(integer);
  }
}
