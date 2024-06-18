package InheritPractice6;

public class MainCC {
  public static void main(String[] args) {
    Computer computer = new Computer();

    computer.say();

    double result = computer.areaCircle(5);
    System.out.println("원의 면적: " + result); // 원의 면적: 78.53975
  }
}
