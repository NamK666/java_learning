package Practice;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class selfpractice2 {
  public static void main(String[] args) {
    /*
                   // while 연습문제 1 //
                   int a = 10;
                   while (a >= 0) {
                     System.out.println("현재 카운트 : " + a);
                     a--;
                   }
                   System.out.println("카운트 종료");

                   // while 퀴즈 1 //
                   int n = 1;
                   int sum = 0;
                   while (n < 100) {
                     sum = sum + n;
                     n++;
                   }
                   System.out.println(sum);


                   // while 퀴즈 2 //
                   int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
                   int i = 0;
                   int sum = 0;
                   while (i < numbers.length){
                     sum = sum + numbers[i];
                     i++;
                   }
                   System.out.println(sum / numbers.length);


                   // while 문제 1 //
                   int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
                   int max = numbers[0];
                   int i = 0;
                   while (i < numbers.length) {
                     if (numbers[i] > max){
                       max = numbers[i];
                     }
                     i++;
                   }
                   System.out.println(max);

                   // while 문제 2 //
                   int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
                   int posSum = 0;
                   int negSum = 0;
                   int i = 0;
                   while (i < numbers.length) {
                     if(numbers[i]>=0){
                       posSum += numbers[i];
                     }else {
                       negSum += numbers[i];
                     }
                     i++;
                   }
                   System.out.println("양수의 합: " + posSum);
                   System.out.println("음수의 합: " + negSum);

                   // for 문 //
                   for (int i=1 ; i<=5 ; i++){
                     System.out.println("현재 i의 값: " + i);
                   }

                   // for 문제 1 //
                   int sum = 0;
                   for (int i=1; i<=100; i++){
                     if(i%2==0){
                       sum+=i;
                     }
                   }
                   System.out.println("짝수의 총합: " + sum);

                   // for 문제 2 //
                   int n = 20;
                   int sum = 0;
                   for (int i=1; i<=n; i++){
                     if(i%3==0 && i%5==0){
                       sum+=i;
                     }
                   }
                   System.out.println(sum);

                   // for문 내림차순 (역방향) (0부터 -100까지 짝수만 출력)//
                   for (int n=0; n>=-100; n--){
                     if(n%2==0){
                       System.out.println(n);
                     }
                   }

                 // 피보나치 수열 //
                   int n = 10;
                   int[] fibArr = new int[n];

                   fibArr[0] = 1;
                   fibArr[1] = 1;
                   for (int i=2; i<n; i++){
                     fibArr[i] = fibArr[i-1] + fibArr[i-2];
                   }
                   System.out.println("피보나치 수열의 첫 " + n + "개 항: ");
                   for (int i=0; i<n; i++){
                     System.out.println(fibArr[i] + " ");
                   }


                // 피보나치 배열 연습 //
                int[] arr = new int[100];
                arr[0] = 1;
                arr[1] = 1;
                for (int i = 2; i < arr.length; i++) {
                  arr[i] = arr[i - 1] + arr[i - 2];
                }
                for (int i = 0; i<arr.length; i++) {
                  System.out.println(arr[i]);
                }

                // for 반복문 문제 1 //
                int n = 2;
                for(int i=1; i<=9; i++){
                  System.out.println(n + " x " + i + " = " + (n*i));
                }

                // for 반복문 문제 2 //
               for (int i=2; i<=9; i++){
                 for (int j=1; j<=9; j++){
                    System.out.println(i + "x" + j + "=" + (i*j));
                 }
                }

                // 19단 역방향 출력 //
                for (int i=19; i>0; i--){
                  System.out.println("19*"+i+"="+(19*i));



            // break 활용 //
                for (int i = 0; i < 10; i++) {
                  System.out.println("현재 i의 값은 =" + i);
                  for (int j = 0; j < 10; j++) {
                    System.out.println("현재 j의 값은 =" + j);
                    if (j == 5) {
                      break;
                    }
                  }
                }

                int count = 1;
                while (count <= 10000){
                  System.out.println(count);
                  count++;
                }

            for (int i = 9; i >= 2; i--) {
              for (int j = 1; j <= 9; j++) {
                System.out.println(i * j);
              }
            }


            // continue 예시 //
            int number = 0;
            while (number < 10) {
              number++;
              if (number == 3) {
                continue;
              } else {
                System.out.println("현재 숫자: " + number);
              }
            }


            // 문제 //
            for (int i=1; i<=10; i++){
              if(i==4 || i==7){
                continue;
              }
              System.out.println(i);


            int a = 10;
            int b = 4;
            int c = a/b;
            double d = a/b;
            double e = (double) a/b;

            System.out.println(c); // 2
            System.out.println(d); // 2.0
            System.out.println(e); // 2.5

            // 삼항 연산자 //
            // 90점 이상이고 5의 배수일 때 문자열 good, 아니라면 bad를 입력하시오.
            int score = 95;
            String grade = (score>=90 && score%5==0 ? "good" : "bad" );
            System.out.println(grade);

            boolean x = true;
            boolean y = false;
            boolean z = true;
            if(x && !y){
              System.out.println("조건1충족");
            }else if((y && z)||(!x && !z)){
              System.out.println("조건2충족");
            }else if(x||y||z){
              System.out.println("적어도 하나는 참");
            }else if(!x&&!y&&!z){
              System.out.println("모두 거짓");
            }

            // Switch문 //
            String day = "목요일";
            switch (day){
              case "월요일":
                System.out.println("헬요일이다.");
                break;
              case "화요일":
                System.out.println("화요일이네.");
                break;
              case "수요일":
                System.out.println("절반 왔구나.");
                break;
              case "목요일":
                System.out.println("거의 다왔다.");
                break;
              case "금요일":
                System.out.println("불금이다!");
                break;
              default:
                System.out.println("주말 잘 즐기자!");
                break;
            }
            String color = "green";
            switch (color){
              case "red":
                System.out.println("apple");
                break;
              case "green":
                System.out.println("forest");
                break;
              case "yellow":
                System.out.println("orange");
                break;
            }

            // while문 연습 //
            int i = 10;
            while (i>=0){
              System.out.println(i);
              i--;
            }

            int n = 100;
            int i = 1;
            int sum = 0;
            while (i<=n){
              sum += i;
              i++;
            }
            System.out.println(sum);


            int[] numbers = {5,2,9,1,7,4,6,3,8};
            int sum = 0;
            int i = 0;
            while (i < numbers.length) {
              sum += numbers[i];
              i++;
            }
            System.out.println(sum/numbers.length);

            // 배열에서 가장 큰값 찾아 출력하기 재도전 //
            int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
            int max = numbers[0];
            int i = 1;
            while (i < numbers.length) {
              if (max < numbers[i]) {
                max = numbers[i];
              }
              i++;
            }
            System.out.println(max); // 20


            //주어진 배열에서 양수의 합과 음수의 합을 각각 구하여 출력하는 프로그램을 작성하세요.//
            int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
            int posSum = 0;
            int negSum = 0;
            int i = 0;
            while (i < numbers.length) {
              if(numbers[i] >= 0) {
                posSum += numbers[i];
              }else if(numbers[i] < 0) {
                negSum += numbers[i];
              }i++;
            }
            System.out.println("양수의 합= " + posSum);
            System.out.println("음수의 합= " + negSum);


            int sum = 0;
            for (int i = 0; i < 100; i++) {
              if (i % 2 == 0) {
                sum += i;
              }
            }
            System.out.println("짝수의 총합: " + sum);

              int sum = 0;
              for (int i=1; i<=20; i++){
                  if(i%3==0&&i%5==0){
                      sum+=i;
                  }
              }
            System.out.println(sum);


                // 피보나치 //
              int[] fibArr = new int[10];
              fibArr[0] = 1;
              fibArr[1] = 1;
              for(int i=2; i<fibArr.length; i++){
                  fibArr[i]=fibArr[i-1]+fibArr[i-2];
              }
            System.out.println("피보나치 수열의 첫 10개 항: ");
              for(int i=0; i<fibArr.length; i++){
              System.out.println(fibArr[i]+" ");
              }

              // 피보나치 셀프 연습 //
              int[] arr = new int[100];
              arr[0] = 1;
              arr[1] = 1;
              for (int i=2; i<arr.length; i++) {
                  arr[i] = arr[i-1] + arr[i-2];
              }
              for (int i=0; i<arr.length; i++) {
              System.out.println(arr[i]);
              }

            // 구구단 2단~9단 출력하기 (반복문 이용) //
            for (int i=2; i<=9; i++){
              for (int j=1; j<=9; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
              }
            }

            // 구구단 2단 출력하기 (반복문 이용) //
            for (int i=1; i<=9; i++){
              System.out.println("2 x "+i +" = "+(2*i));
            }


            for(int i=1; i<=10; i++){
              if(i==4||i==7){
                continue;
              }
              System.out.println(i);
            }

            // 이중 for문 //
            for (int i=1; i<100; i++){
              System.out.println("현재 i의 값은 = " + i);
              if(i==50){
                break;
              }for (int j=2; j<100; j++){
                System.out.println("현재 j의 값은 = " + j);
                if(j==80){
                  break;
                }
              }
            }

        // 향상된 반복문 예시 //
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
          System.out.println(num);
        }

    List<String> fruits = Arrays.asList("apple", "banana", "orange");
        for (String fruit : fruits) {
          System.out.println(fruit);
        }

    // 향상된 반복문 연습1//
    int[] scores = {1, 2, 3, 4, 5};
    int sum = 0;
    for (int num : scores) {
      sum = sum + num;
    }
    double average = (double) sum / scores.length;

    System.out.println("총합: " + sum);
    System.out.println("평균: " + average);

    // 향상된 반복문 연습 1 재도전 (점수의 총합, 평균 구하기) //
    int[] scores = {10, 20, 30, 40, 50};
    int sum = 0;
    for (int score : scores){
      sum += score;
    }
    double avg = (double) sum / scores.length;
    System.out.println("총합: " + sum);
    System.out.println("평균: " + avg);

    List<String> names = Arrays.asList("John Doe", "Jane Doe", "NamKyung", "Raf");
    for (String name : names){
      if(name.length()>=5){
        System.out.println(name);
      }
    }

    // 연습2 재도전//
    // 문자열 배열 names가 주어졌을 때,
    // 향상된 반복문을 사용하여 이름의 길이가 5 이상인 이름만 출력하는 코드를 작성
    List<String> names = Arrays.asList("LeeNamKyung", "Joe", "Budden", "Kdot");
    for (String name : names) {
      if(name.length()>=5){
        System.out.println(name);
      }
    }


    // for 문자열 연습 //
    String[] words = {"apple", "banana", "cherry", "durian"};
    for(int i=0; i<words.length-1; i++){
      for(int j=i+1; j<words.length; j++){
        System.out.println(words[i]+" "+words[j]);
      }
    }
*/
    // 이중 for 문 재연습 //
    String[] words = {"apple","banana","cherry","kiwi"};
    for (int i=0; i<words.length-1; i++){
      for (int j=i+1; j<words.length; j++){
        System.out.println(words[i]+ " " + words[j]);
      }
    }

  }
}
