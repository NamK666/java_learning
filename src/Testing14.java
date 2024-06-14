public class Testing14 {
  public static void main(String[] args) {

    try {
      divide(10, 0);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
    System.out.println("정상적으로 종료되었습니다.");
  }

  private static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
