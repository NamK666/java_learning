package InheritPractice6;

public class Calculator {
  private static final double PI = 3.14159;

  double areaCircle(double radius) {
    System.out.println("Calculator 객체의 areaCircle 메소드 실행");
    return PI * radius * radius;
  }

  void say(){
    System.out.println("뭐든지 말을 해보소");
  }
}
