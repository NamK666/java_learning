package GenericPractice;

public class GenericExample {
  public static void main(String[] args) {
    Box<String> box = new Box<>();
    box.set("hello");

    String str = box.get();
    System.out.println(str); // hello

    Box<Integer> box1 = new Box<>();
    box1.set(10);

    int i = box1.get();
    System.out.println(i); // 10
  }
}
