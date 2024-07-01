package GenericPractice5;

public class Main {
  public static void main(String[] args) {
    Box<String> stringBox = new Box<>();
    Box<Integer> integerBox = new Box<>();

    integerBox.setT(10);
    int intVal = integerBox.getT();
    System.out.println(intVal);

    stringBox.setT("hello");
    String stringVal = stringBox.getT();
    System.out.println(stringVal);
  }
}
