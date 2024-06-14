import java.util.Scanner;

public class quiz1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("첫 번째 정수를 입력하세요.");
      int a = scanner.nextInt();

      System.out.println("두 번째 정수를 입력하세요.");
      int b = scanner.nextInt();

      System.out.println(a / b);

    } catch (ArithmeticException e) {
      System.out.println("옳바른 숫자가 아닙니다.");
    }
    finally{
      System.out.println("종료 되었습니다.");
      scanner.close();
    }

  }
}
