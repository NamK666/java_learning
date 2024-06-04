package Practice;

public class selfpractice1 {
  public static void main(String[] args) {
    int a = 10;
    while (a > 0) {
      System.out.println("현재 카운트: " + a);
      a--;
    }

    int b = 20;
    while (b > 0) {
      System.out.println("현재 카운트: " + b);
      b--;
    }

    // 1부터 100까지의 합 (while문 사용) //
      int i = 1;
    int n = 100;
    int sum = 0;
    while (i <= 100){
        sum = sum + i;
        i++;
    }
    System.out.println(sum);

    // 주어진 배열의 평균 출력 //
      int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
      int index = 0;
      int suM = 0;
      while (index < numbers.length){
          suM = suM + numbers[index];
          index++;
      }
    System.out.println(suM / numbers.length);


    System.out.println("-----------------------------------");
      // 배열 예시 //
    int[] number = {1,2,3,4,5};
    for (int num : number){
      System.out.println(num);
    }



  }
}
