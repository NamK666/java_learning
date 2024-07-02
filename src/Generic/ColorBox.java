package Generic;

public class ColorBox<T> extends Box<T> {
  private String color;

  public ColorBox(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }
}
