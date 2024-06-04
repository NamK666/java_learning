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
    /*

        // For 문 문제 1 //
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
          if (i % 2 == 0) {
            sum += i;
          }
        }
        System.out.println("1부터 100까지의 짝수의 합: " + sum);

        // For 문 문제 2 //
        int n = 20;
        for (int i = 1; i <= n; i++) {
          if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("sum = " + (i + i));
          }
        }

        // 피보나치 수열 문제 //

        // for문 내림차순 (역방향) //
        for (int i = 100; i > 0; i--) {
          System.out.println(i);
        }

        // for문 내림차순 (역방향) 0부터 -100까지 짝수만 출력 //
        for (int i = 0; i >= -100; i--) {
          if (i % 2 == 0) {
            System.out.println(i);
          }
        }

        // 피보나치 배열 //
        int[] arr = new int[100];
        // 이 arr배열을 피보나치 배열로 만들어보자 //
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
          arr[i] = arr[i - 1] + arr[i - 2];
          System.out.println(arr[i]);
        }

        // For문 중첩 //
        for (int i = 0; i < 10; i++) { // 여기서 i는 for문 내에서만 사용 가능한것임. (지역변수)
          System.out.println(i);
        }

        // 구구단 2단 출력하기 //
        for (int i = 1; i <= 9; i++) {
          System.out.println("2 * " + i + " = " + i * 2);
        }

        System.out.println("-----------------");

        // 구구단 2단 ~ 9단 출력하기 //
        for (int i = 2; i <= 9; i++) {
          for (int j = 1; j <= 9; j++) {
            System.out.println(i * j);
          }
        }

        System.out.println("-----------------");

        // 구구단 19단을 역방향으로 출력하기 //
        for (int i = 19; i >= 1; i--) {
          for (int j = 19; j >= 1; j--) {
            System.out.println(i * j);
          }
        }

        // break while//
        int number = 0;
        while (number < 10) {
          System.out.println("현재숫자: " + number);
          if (number == 5) {
            System.out.println("5가 되었습니다.");
            break;
          }
          number++;
        }

        System.out.println("---------------");

        // break for //
        for (int i = 0; i < 10; i++) {
          System.out.println("현재 i의 값은 =" + i);
          for (int j = 0; j < 10; j++) {
            System.out.println("현재 j의 값은 =" + j);
            if (j == 5) {
              break;
            }
          }
        }

        // 이중 포문을 만든다. i-> 1~100 , j-> 2~100 //
        // (조건) i가 50이 되면 break, j는 80이 되면 break; //
        for (int i = 1; i < 100; i++) {
          System.out.println("현재 i의 값은 =" + i);
          if (i == 50) {
            break;
          }
          for (int j = 2; j < 100; j++) {
            System.out.println("현재 j의 값은 =" + j);
            if (j == 80) {
              break;
            }
          }
        }

        int numb = 0;
        while (numb <10){
          numb++;
          if(numb ==3){
            continue;       // 여기서 continue때문에, 밑으로 더 내려가지 않는거임.
          }else{
            System.out.println("현재 값은 :"+numb);
          }
        }

        for(int i=0; i<10; i++){
          if(i==3){
            continue;
          }else {
            System.out.println("현재 값은 : "+i);
          }
        }

        // 1부터 10까지의 숫자를 출력하세요. 이때 4와 7은 건너뛰고 출력하기 //
        for (int i=1; i<10; i++){
          if(i==4 || i==7){
            continue;
          }
          System.out.println(i);
        }

    */

    System.out.println("--------------");

    // 구현퀴즈 1 //
    int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
    int sum = 0;
    for (int i: scores){
      sum += i;
    }
    System.out.println("총합: " + sum);
    System.out.println("평균: " + sum/scores.length);


    // 구현퀴즈 2 //
    String[] arr = {"okay2", "asdff", "good2", "fight", "hello"};
    for (String a : arr) {
      if (a.length() >= 5){
        System.out.println(a);
      }
    }

  }
}
