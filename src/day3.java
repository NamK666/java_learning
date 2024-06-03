public class day3 {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 3;

    int sum = number1 + number2;
    int diff1 = number2 - number1;
    int diff2 = number1 - number2;

    int product = number1 * number2;
    int quot = number1 / number2;
    int remainder = number1 % number2;

    System.out.println("덧셈" + sum);
    System.out.println("뺄셈1" + diff1);
    System.out.println("뺄셈2" + diff2);
    System.out.println("곱셈" + product);
    System.out.println("나눗셈" + quot);
    System.out.println("나머지" + remainder);

    byte a = 1;
    byte b = 1;
    int c = a + b;

    int d = 10;
    int e = 4;
    int f = d / e;
    double g = d / e;
    System.out.println(g); // 2.0 // 만약에 2.5를 반출하고싶으면 double g = (double) d/e ; 로 해야함.

    char c1 = 'A' + 1;
    char c2 = 'A';
    int c3 = c2 + 1;
    System.out.println(c3); // 66 (?)

    String str1 = "안녕하세요. ";
    String str2 = "만나서 반갑습니다.";
    String str3 = str1 + str2;
    System.out.println(str3); // 안녕하세요. 만나서 반갑습니다.

    System.out.println(
        "Hello" + 123
            + 456); // Hello123456 (왼쪽부터 먼저 수행된다. 순서가 중요하다. Hello + 123이 먼저 계산돼서, 어?문자네? 하고 뒤에 456을
    // 그대로 붙이는거임)
    System.out.println(123 + 456 + "Hello"); // 579Hello (123+456이 먼저 수행돼서 579)

    StringBuilder sb = new StringBuilder();
    sb.append(123);
    sb.append(456);
    sb.append("Hello");
    System.out.println(sb); // 123456Hello

    int number3 = 10;
    int number4 = 30;
    System.out.println(number3 > number4); // false
    System.out.println(number3 == number4); // false
    System.out.println(number3 != number4); // true
    System.out.println(number3 < number4); // true
    System.out.println(number3 >= number4); // false
    System.out.println(number3 <= number4); // true

    String t = new String();
    String q = new String();
    System.out.println(t == q); // false (메모리주소값이 다르기 때문에)
    System.out.println(t.equals(q)); // true (문자 값 그대로 비교하기 때문에)

    System.out.println('A' < 'B'); // true (유니코드로 변경돼서 비교함)

    // AND (&&) //
    System.out.println(true && true); // true (모든 값이 true여야만 true다.)
    System.out.println(true && false); // false
    System.out.println(false && true); // false
    System.out.println(false && false); // false

    // OR (||) //
    System.out.println(true || true); // true (하나라도 참이면 true)
    System.out.println(true || false); // true
    System.out.println(false || true); // true
    System.out.println(false || false); // false

    // XOR (^) //
    System.out.println(true ^ false); // true (하나는 true고 하나는 False여야 true)

    /*

    //x는 5보다 크고 13보다 작다.
    x > 5 && x < 13

    // i는 2의 배수 또는 3의 배수이다.
    i%2==0 || i%3==0;

    //i는 2의 배수이면서 3의 배수이다.
    i%2==0 && i%3==0;

    //x는 30의 배수이면서 2의 배수이거나 5의 배수이다.
    x%30==0 && ( (x%2==0)||(x%5==0) );

     */

    // 논리곱
    System.out.println(1 & 1); // 1
    System.out.println(1 & 0); // 0
    System.out.println(0 & 0); // 0

    // 논리합
    System.out.println(1 | 1); // 1
    System.out.println(1 | 0); // 1
    System.out.println(0 | 0); // 0

    // 삼항 연산자
    int score = 95;
    char grade = (score > 90) ? 'A' : 'B';
    System.out.println(grade); // A
    // 90점 이상이고 5의 배수일 때 문자열 good, 아니라면 bad를 입력하시오.
    String grade2 = (score >= 90 && score % 5 == 0) ? "good" : "bad";

    // 90점이상이면 good, 아니면 bad를 출력하게 if문으로 풀어보기.
    if (score > 90) {
      System.out.println("good");
    } else {
      System.out.println("bad");
    }

    int number = 10;
    if (number > 10) {
      System.out.println("number는 10보다 큽니다");
    } else if (number < 10) {
      System.out.println("number는 10보다 작습니다.");
      if (number > 5) {
        System.out.println("number는 5보다 큽니다.");
      }
    } else {
      System.out.println("number는 10입니다.");
    }

    // if, else if, else 문 활용하기 //
    int h = 1;
    int i = 2;
    if (h > i) {
      System.out.println("h is greater than i");
    } else if (h == i) {
      System.out.println("h and i are equal");
    } else {
      System.out.println("h is less than i");
    }

    // 위에 것을 삼항연산자로 바꿔보기 //

  }
}
