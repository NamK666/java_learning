package Practice;

import java.sql.Array;
import java.util.Arrays;

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
*/
  // 피보나치 수열 //
    int n = 10;
    int[] fibArr = new int[n];

    fibArr[0] = 1;
    fibArr[1] = 1;
    for (int i=2; i<=n; i++){
      fibArr[i] = fibArr[i-1] + fibArr[i-2];
    }
  }
}
