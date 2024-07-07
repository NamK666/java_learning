package OCP;

public class AreaCalculator {
  public double calculate(Shape[] shapes) {
    double totalArea = 0;
    for (Shape shape : shapes) {
      totalArea += shape.area();
    }
    return totalArea;
  }
}
