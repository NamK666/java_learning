import java.util.ArrayList;
import java.util.List;

public class ArrayListTesting {
  public static void main(String[] args) {
    ArrayList<String> menu = new ArrayList<>();

    menu.add("pizza");
    menu.add("burger");
    menu.add("cake");

    System.out.println(menu.get(0));
    System.out.println(menu.get(1));
    System.out.println(menu.get(2));
  }
}
