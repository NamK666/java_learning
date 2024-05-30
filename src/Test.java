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
  }
}
