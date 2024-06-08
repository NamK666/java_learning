package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//

public class selfpractice3 {
  public static void main(String[] args) {
    /*
    Scanner sc = new Scanner(System.in);

       System.out.println("정수를 입력하세요: ");
       int number = sc.nextInt();
       System.out.println("입력한 정수는 " + number + "입니다.");
       sc.close();


    System.out.println("1에서 4사이의 숫자를 입력하시오.");
    int number = sc.nextInt();
    switch (number) {
      case 1:
        System.out.println("봄");
        break;
      case 2:
        System.out.println("여름");
        break;
      case 3:
        System.out.println("가을");
        break;
      case 4:
        System.out.println("겨울");
        break;
      default:
        System.out.println("잘못된 입력입니다!");
        break;
    }
    sc.close();


    Scanner sc1 = new Scanner(System.in);
    Random random = new Random();
    int targetNumber = random.nextInt(100)+1;
    int userGuess; // 여기서는 왜 임의의 값을 안주지?
    System.out.println("1부터 100 사이의 숫자를 맞춰보세요.");

    while (true){   // 여기서 true란 뭐지? 왜 적는거지?
      System.out.println("숫자를 입력하세요: ");
      userGuess = sc.nextInt();

      if (userGuess < targetNumber){
        System.out.println("더 높은 숫자입니다.");
      }else if(userGuess > targetNumber){
        System.out.println("더 낮은 숫자입니다.");
      }else {
        System.out.println("정답입니다! ㅊㅋㅊㅋ");
        break;
      }
    }
    sc.close();
    sc1.close();


    Scanner sc = new Scanner(System.in);
    System.out.println("영화 제목을 입력하세요.");
    String movieName = sc.nextLine();
    System.out.println("인원수를 입력하세요.");
    int number = sc.nextInt();
    sc.nextLine(); // nextInt()와 nextLine()혼용시 발생하는 에러 방지용
    System.out.println("예매자 성함을 입력하세요.");
    String name = sc.nextLine();
    System.out.println("전화번호를 입력하세요.");
    int phone = sc.nextInt();

    System.out.println("=====영화 티켓 예매 정보=====");
    System.out.println("영화 제목: " + movieName);
    System.out.println("관람 인원: " + number + "명");
    System.out.println("예매자 이름: " + name);
    System.out.println("예매자 전화번호: " + phone);

    System.out.println("총 결제 금액: " + (10000 * number) + "원");

    sc.close();

    Random random = new Random();
    int[] arr = new int[6];
    ArrayList<Integer> list = new ArrayList<Integer>();

    while(list.size()!=6){
      int number = random.nextInt(45)+1;
      if(!list.contains(number)){
        list.add(number);
      }
    }
    for(int data:list){
      System.out.println(data+"  ");
    }


    String h= "a:b:c:d";
    String[] split = h.split(":");
    System.out.println(Arrays.toString(split));

     */

    String[] words = {"apple", "banana", "cherry", "durian"};
    for (int i = 0; i < words.length - 1; i++) {
      for (int j = 1; j < words.length; j++) {
        System.out.println(words[i] + " " + words[j]);
      }
    }
  }
}
