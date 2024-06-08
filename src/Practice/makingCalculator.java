package Practice;

import java.util.Scanner;

public class makingCalculator {
  public static void main(String[] args) {
    System.out.println("원하는 기능을 선택하세요");
    System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
    Scanner scanner = new Scanner(System.in);
    int func = scanner.nextInt();
    switch (func) {
      case 1:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        int addFirstNum = scanner.nextInt();
        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
        int addSecondNum = scanner.nextInt();
        System.out.println(
            addFirstNum + " + " + addSecondNum + " = " + (addFirstNum + addSecondNum));
        break;
      case 2:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        int subFirstNum = scanner.nextInt();
        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
        int subSecondNum = scanner.nextInt();
        System.out.println(
            subFirstNum + " - " + subSecondNum + " = " + (subFirstNum - subSecondNum));
        break;
      case 3:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        int mulFirstNum = scanner.nextInt();
        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
        int mulSecondNum = scanner.nextInt();
        System.out.println(
            mulFirstNum + " * " + mulSecondNum + " = " + (mulFirstNum * mulSecondNum));
        break;
      case 4:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        int divFirstNum = scanner.nextInt();
        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
        int divSecondNum = scanner.nextInt();
        System.out.println(
            divFirstNum + " / " + divSecondNum + " = " + (divFirstNum / divSecondNum));
        break;
      default:
        System.out.println("올바른 입력이 아닙니다.");
        break;
    }
  }
}
