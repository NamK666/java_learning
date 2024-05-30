public class Test {

  public static void main(String[] args) {
    int draco = 10; // 컴퓨터의 메모리에 이 정보가 올라감. (a는 integer타입을 갖고있으며, 10이라는 값을 갖고있다) / 변수를 선언하면서 값을 넣었다.
    System.out.println(draco); // 실행될 때 까지, 메모리에서 a를 기억하고 있는 것임.
    System.out.println(draco); // 실행될 때 까지, 메모리에서 a를 기억하고 있는 것임.

    double b = 10.0; // 빨간 줄 나오는 것은 컴파일시 에러를 체크하는 것임. (ex: int a = 1.0;)
    // 내가 자바가 실행했을 동안 문제가 생긴다: 런타임 에러 (서비스가 돌아가는 동안 문제 발생)
    // 그러니까, 컴파일 에러때 미리 최대로 에러를 잡아야만 좋은 것임.

    int okayMyNameIsMax; // 카멜케이스

    int test1 = 10;
    int test2 = 60;
    int test3 = 30;
    System.out.println(test1 + test2 + test3);

    int t1, t2, t3;
    t1 = 10;
    t2 = 20;
    t3 = 70;
    System.out.println(t1 + t2 + t3);

    int D = 1;
    int d = 2;
    // 둘이 다른 거임. (대소문자 구별함)

    /* int int = 1; */    // 변수명으로 예약어를 사용못함. (int는 예약어임)

    int firstName = 1; // 컴퓨터 메모리 어딘가에 1이라는 값이 저장되어있는것을 끄집어 오는 것이다.
    /* 자바가 켜져있는 동안에는 메모리에 저장되어있는 것임. 반면, 자바가 꺼지는 순간 X) */

    /* 정수형 자료형 (중요) */
    /* int A = 1;
    byte B = 2;
    long C = 3;
    short D = 4; */
    /* 실수형 자료형 */
    float E = 0.1f; //f를 뒤에 붙여줘야 한다 꼭!
    double F = 0.2;

    char G = 'g';
    System.out.println(G);

    boolean isTrue = true;
    boolean isFalse = false;


    String str = "Hello World"; // string은 문자열을 위한 클래스라고 생각하면 됨.

    /*
    int x = 21500000000; // int가 커버가능한 숫자를 초과해서 오류 뜸.
    System.out.println(x);
    */

   char c1 = 'A';
   char c2 = 65;
   char c3 = '\u0041';

   char c4 = '가';
   char c5 = 44032;
   char c6 = '\uac00';

   int uniCode = c1;

   System.out.println(c1); // A
   System.out.println(c2); // A
   System.out.println(c3); // A
   System.out.println(c4); // 가
   System.out.println(c5); // 가
   System.out.println(c6); // 가
   System.out.println(uniCode); // 65
  }
}
