public class ThrowsExample {
  public static void main(String[] args) {

    try {
      int result = divide(10, 0);
      System.out.println("결과: " + result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally{
      System.out.println("코드가 정상적으로 종료되었습니다.");
    }
  }

  public static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
