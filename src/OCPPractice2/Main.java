package OCPPractice2;

public class Main {
  public static void main(String[] args) {
    Shape[] shapes = {new Rectangle(5, 10), new Circle(7), new Rectangle(10, 20)};

    AreaCalculator calculator = new AreaCalculator();
    double totalArea = calculator.calculate(shapes);

    System.out.println("Total area: " + totalArea);
  }
}
