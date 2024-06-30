package OverridePractice1;

public class Calculator {
  private static final double PI = 3.14159;

  double areaCircle(double r) {
    System.out.println("Calculator객체의 areaCircle 메소드 실행");
    return PI * r * r;
  }

  void say() {
    System.out.println("뭐든지 말을 해보소");
  }
}
