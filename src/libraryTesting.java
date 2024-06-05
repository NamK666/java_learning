/*

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class libraryTesting {
  public static void main(String[] args) {
    Random random = new Random(); // "random 이란 변수는 Random에 접근할 수 있는 메모리 주소를 갖고 있다"
    int targetNumber = random.nextInt(100) + 1; // 1부터 100사이의 랜덤 숫자 생성
    int userGuess;

    System.out.println("1부터 100사이의 숫자를 맞춰보세요.");

    while (true) {
      System.out.println("숫자를 입력하세요: ");
      userGuess = scanner.nextInt();

      if (userGuess == targetNumber) {
        System.out.println("더 높은 숫자입니다.");
      } else if (userGuess > targetNumber) {
        System.out.println("더 낮은 숫자입니다.");
      } else {
        System.out.println("정답입니다! 숫자는 " + targetNumber + "입니다.");
        break;
      }
    }
    scanner.close();
    /*
        int[] arr = new int[5];

        ArrayList<Integer> list =
            new ArrayList<Integer>(); // 정수형 리스트가 만들어짐. ArrayList라는거는 내가 빈 리스트를 만들고 내가 추가 할수 있는것. (로또번호 6개를 담기위해서 만들었음)
        // 꺽새 안에 있는 것 (Integer)은 타입이다. int의 클래스형태가 Integer 이다.
        // int -> Integer (이를 boxing 이라고 하고, Integer를 wrapper class 라고 함) (반대는 unboxing 이라고함)
        // boolean -> Boolean (꺾새 안에는 wrapper class만 들어가야 함)

        while(list.size()!=6){
          int number = random.nextInt(45)+1;     // +1을 안하면 0부터 44까지 나오게 됨.

          if(!list.contains(number)){     // 내가 뽑은 랜덤값이 list안에 없다면,
            list.add(number);           // list안에 숫자를 넣는 것.
          }
        }
    // 출력하기 위한 for문 //
        for(int data:list){
          System.out.println(data);
        }




        /* 혼자 해보기
        int a = random.nextInt(45) + 1;
        int b = random.nextInt(45) + 1;
        int c = random.nextInt(45) + 1;
        int d = random.nextInt(45) + 1;
        int e = random.nextInt(45) + 1;
        int f = random.nextInt(45) + 1;

        int[] numbers = {a, b, c, d, e, f};
        if (a != b && a != c && a != d && a != e && a != f && b != c && b != d && b != e && b != f
            && c != d && c != e && c != f && d != c && d != e && e != f && f != d && e != f && f != d) {
          System.out.println(
              "로또 번호: ["
                  + numbers[0]
                  + "], ["
                  + numbers[1]
                  + "], ["
                  + numbers[2]
                  + "], ["
                  + numbers[3]
                  + "], ["
                  + numbers[4]
                  + "], [" + numbers[5] + "]");
        }

    // 중복을 알아서 제거해주는 set 활용 하기 //
        Set<Integer> set = new HashSet<>();

        while(set.size()!=6){
          int number = random.nextInt(45) + 1;
          set.add(number);
        }



  }
}
*/