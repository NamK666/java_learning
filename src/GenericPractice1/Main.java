package GenericPractice1;

public class Main {
  public static void main(String[] args) {
    Box<String> box = new Box<>();
    box.setT("Hello");

    String str = box.getT();
    System.out.println(str);

    Box<Integer> intBox = new Box<>();
    intBox.setT(10);

    int intVal = intBox.getT();
    System.out.println(intVal);
  }
}
