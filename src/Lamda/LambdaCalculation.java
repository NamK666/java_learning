package Lamda;

public class LambdaCalculation {
  interface MathOperation {
    int operate(int a, int b);
  }

  public static void main(String[] args) {
    MathOperation addition = (a, b) -> a + b;
    MathOperation subtraction = (a, b) -> a - b;

    System.out.println("10 + 5 = " + addition.operate(10, 5));
    System.out.println("10 - 5 = " + subtraction.operate(10, 5));
  }
}
