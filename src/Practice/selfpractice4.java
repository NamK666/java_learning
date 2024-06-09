package Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class selfpractice4 {
  public static void main(String[] args) {
    /*
        Scanner sc=new Scanner(System.in);

    System.out.println("1에서 4사이의 숫자를 입력하세요.");
    int number = sc.nextInt();
    switch (number){
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


    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    int randomNum = random.nextInt(100) + 1;
    System.out.println("1부터 100사이의 숫자 중에서 맞춰보세요.");
    while (true) {
      System.out.println("숫자를 입력하세요.");
      int guessNum = sc.nextInt();

      if (guessNum > randomNum) {
        System.out.println("더 작은 숫자입니다.");
      } else if (guessNum < randomNum) {
        System.out.println("더 큰 숫자입니다.");
      } else {
        System.out.println("정답입니다ㅊㅋㅊㅋ");
        break;
      }
      }

    Random random = new Random();
    int[] arr = new int[5];
    ArrayList<Integer> list = new ArrayList<Integer>();

    while(list.size()!=6){
      int number = random.nextInt(45)+1;
      if(!list.contains(number)){
        list.add(number);
      }
    }
    for(int data: list){
      System.out.println(data);
    }

    String[] words = {"apple","banana","cherry","durian"};
    for (int i = 0; i<words.length-1; i++){
      for (int j= 1; j<words.length; j++){
        System.out.println(words[i] + " " + words[j]);
      }
    }

    Scanner sc = new Scanner(System.in);
    System.out.println("계절을 맞춰보세요.");
    int num = sc.nextInt();
    switch (num) {
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


    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    int randomNum = random.nextInt(100) + 1;
    System.out.println("1부터 100사이의 숫자를 입력하세요.");
    while (true) {
      int guessNum = sc.nextInt();
      if (guessNum > randomNum) {
        System.out.println("더 작은 숫자입니다.");
      } else if (guessNum < randomNum) {
        System.out.println("더 큰 숫자입니다.");
      } else {
        System.out.println("정답입니다 ㅊㅋ요!");
        break;
      }
    }
    sc.close();
    random = null;


    Scanner sc = new Scanner(System.in);

    System.out.println("영화 제목을 입력하세요.");
    String movieName = sc.nextLine();
    System.out.println("인원 수를 입력하세요.");
    int people = sc.nextInt();
    sc.nextLine();
    System.out.println("예매자 성함을 입력하세요.");
    String name = sc.nextLine();
    System.out.println("전화 번호를 입력하세요.");
    int phoneNum = sc.nextInt();

    System.out.println("=====영화 티켓 예매 정보=====");
    System.out.println("영화 제목: ["+movieName+"]");
    System.out.println("관람 인원: ["+people+"]명");
    System.out.println("예매자 이름: ["+name+"]");
    System.out.println("예매자 전화번호: ["+phoneNum+"]");

    System.out.println("총 결제 금액: ["+(10000*people)+"]원");
    sc.close();

    */
    // ArrayList 활용해보기 //

    // ArrayList 생성 (String타입으로 문자열 배열을 만듬)
    ArrayList<String> brands = new ArrayList<>();

    // 원소 추가
    brands.add("soloist");
    brands.add("rafsimons");
    brands.add("rickowens");

    // 특정 index에 원소 추가하기
    brands.add(1, "hernan");

    // 원소 접근
    System.out.println(brands.get(0));
  }
}
