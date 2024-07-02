package Generic;

public class Main {
  public static void main(String[] args) {
    ColorBox<String> colorBox = new ColorBox<>("blue");

    colorBox.setContent("content setting");
    System.out.println(colorBox.getContent());

    System.out.println(colorBox.getColor());
  }
}
