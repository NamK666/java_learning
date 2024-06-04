import java.util.stream.IntStream;

public class day4 {
  public static void main(String[] args) {
    /*

    // while 문 //
    int i = 1;
    while (i <= 5) {
      System.out.println("현재 i의 값은 = " + i);
      i++;
    }

    // 연습문제 //
    int t = 10;
    while (t >= 0) {
      System.out.println("현재 카운트 : " + t);
      t--;
    }
    System.out.println("카운트 종료");

    // 퀴즈 1 //

    // 다른 풀이 //
    int sum = IntStream.rangeClosed(1, 100).sum();
    System.out.println(sum);

    // 퀴즈 2 //
    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    int index = 0;
    int suM = 0;
    while (index < numbers.length) {
      suM += numbers[index];
      index++;
    }
    System.out.println(suM / numbers.length);

    /*
    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    System.out.println(Arrays.stream(numbers).average());
    */

    // 3의 배수만 출력하기 //
    int I = 0;
    while (I <= 300) {
      if (I % 3 == 0) {
        System.out.println(I);
      }
      I++;
    }
    /*
       // 주어진 배열에서 가장 큰 값을 찾아 출력하는 프로그램 작성 (while문, 배열 사용하여) //
       int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
       int max = numbers[0]; // 일단 아무거나 맥스를 정해둠. 그럼 10이되는거임 일단.
       int i = 1; // 1번째 인덱스부터 비교하면 되는거임.
       while (i < numbers.length) {
         if (numbers[i] > max) {
           max = numbers[i];
         }
         i++;
       }
       System.out.println(max);
    */

    /*
    // 주어진 배열에서 양수의 합과 음수의 합을 각각 구하여 출력하는 프로그램을 작성 (while문을 활용하여) //
    int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    int positiveSum = 0;
    int negativeSum = 0;
    int i = 0;
    while (i < numbers.length) {
      if (numbers[i] > 0) {
        positiveSum += numbers[i];
      } else {
        negativeSum += numbers[i];
      }
      i++;
    }
    System.out.println(positiveSum);
    System.out.println(negativeSum);

     */

    /*
        // For 문 //
        for(int i=1; i<=5; i++){
          System.out.println("현재 i의 값은 "+i);
        }
    */
    // For 문 문제 1 //
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println("1부터 100까지의 짝수의 합: " + sum);

    // For 문 문제 2 //


  }
}
