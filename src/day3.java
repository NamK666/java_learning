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
      System.out.println("h is less than i"); // h is less than i
    }

    // 위에 것을 삼항연산자로 바꿔보기 //
    String grade3 =
        (h > i) ? "h is greater than i" : (h < i) ? "h is less than i" : "h and i are equal";
    System.out.println(grade3); // h is less than i

    // 변수 x에 10이 저장되어 있습니다. x가 양수인지, 음수인지, 아니면 0인지를 판별하는 코드를 작성하세요. (삼항연산자) //
    int x = 10;
    if (x > 0) {
      System.out.println("x는 양수입니다."); // x는 양수입니다.
    } else if (x == 0) {
      System.out.println("x는 0입니다.");
    } else {
      System.out.println("x는 음수입니다.");
    }
    String q1 = (x > 0) ? "x는 양수입니다." : (x == 0) ? "x는 0입니다." : "x는 음수입니다.";
    System.out.println(q1); // x는 양수입니다.

    // 변수 score4에 75가 저장되어 있습니다. score에 따라 학점을 출력하는 코드를 작성하세요.
    int score4 = 75;
    if (score4 >= 90) {
      System.out.println("A");
    } else if (score4 >= 80 && score4 < 90) {
      System.out.println("B");
    } else if (score4 >= 70 && score4 < 80) { // C
      System.out.println("C");
    } else if (score4 >= 60 && score4 < 70) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }

    // 변수 year에 2023이 저장되어 있습니다. year가 윤년인지 아닌지를 판별하는 코드를 작성하세요. //
    // 윤년의 조건: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수인 해 //
    int year = 2023;
    if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println("윤년입니다.");
    } else {
      System.out.println("윤년이 아닙니다."); // 윤년이 아닙니다.
    }

    // 변수 aa에 10, bb에 20, cc에 30이 저장되어 있습니다. 세 변수 중 가장 큰 값을 출력하는 코드를 작성하세요. //
    int aa = 10;
    int bb = 20;
    int cc = 30;
    if (aa > bb && aa > cc) {
      System.out.println(aa);
    } else if (bb > aa && bb > cc) {
      System.out.println(bb);
    } else {
      System.out.println(cc);
    }

    // 변수 passScore에 60이 저장되어 있습니다. 변수 myScore에 75가 저장되어 있을 때, myScore가 passScore 이상인지 판별하여 합격/불합격을
    // 출력하는 코드를 작성하세요. (삼항연산자) //
    int passScore = 60;
    int myScore = 75;
    String checkPass = (myScore >= passScore) ? "pass입니다" : "fail입니다";
    System.out.println(checkPass); // pass입니다

    // 논리 연산자 //
    int a1 = 10;
    int b1 = 5;

    boolean result1 = (a1 > 5) && (b1 < 10);
    boolean result2 = (a1 > 5) || (b1 > 10);
    boolean result3 = !(a1 > 5);
    System.out.println(result1); // true
    System.out.println(result2); // true
    System.out.println(result3); // false

    // 논리 연산자 연습2 //
    int three = 3;
    int five = 5;
    int two = 2;
    boolean result = (five > three) || (five < two) && (five < three);
    // true || false && false  ( true or false 에서는 무조건 true가 됨 ) (둘다 false면 false이고)
    System.out.println(result); // true

    // 논리 연산자 퀴즈2 //
    boolean xx = true;
    boolean yy = false;
    boolean zz = true;
    if (xx = true && yy == false) {
      System.out.println("조건1충족");
    } else if ((yy == true && zz == true) || (xx == false) && (zz == false)) {
      System.out.println("조건2 충족");
    } else if (xx == false && yy == false && zz == false) {
      System.out.println("모두 거짓");
    }

    // Switch 문 //
    int data = 10;
    switch (data) {
      case 1:
        System.out.println("1입니다.");
        break;
      case 2:
        System.out.println("2입니다.");
        break;
      case 10:
        System.out.println("10입니다.");
        break;
      default:
        System.out.println("default입니다.");
    }

    // Switch문 요일 문제 //
    String day = "수요일";
    switch (day) {
      case "월요일":
        System.out.println("책 읽기");
        break;
      case "화요일":
        System.out.println("영화 보기");
        break;
      case "수요일":
        System.out.println("맥주 마시기");
        break;
      case "목요일":
        System.out.println("게임하기");
        break;
      case "금요일":
        System.out.println("쇼핑하기");
        break;
      case "토요일":
        System.out.println("데이트하기");
        break;
      case "일요일":
        System.out.println("군것질하기");
        break;
      default:
        System.out.println("알 수 없는 요일");
        break;
    }
    // 퀴즈 1 //
    char grade1 = 'A';
    switch (grade1) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
        case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fail");
        break;
      default:
        System.out.println("알 수 없는 점수입니다.");
        break;
    }
    // 퀴즈 2 //
    char operator = '+';
    int num1 = 5;
    int num2 = 10;
    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
    }

    // 퀴즈 3 //
    String color = "blue";
    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "green":
        System.out.println("Grass");
        break;
      case "blue":
        System.out.println("Sky");
        break;
    }

    // 퀴즈 4 //
    int score2 = 90;
    switch (score2 / 10) {
      case 10, 9:
        System.out.println("A");
        break;
        case 8:
        System.out.println("B");
        break;
        case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
        break;
    }

    // 퀴즈 5 //
    String language = "Java";
    switch (language) {
      case "Java":
        System.out.println("Java is blah blah");
        break;
      case "Python":
        System.out.println("Python is blah blah");
        break;
      case "C++":
        System.out.println("C++ is blah blah");
        break;
      case "JavaScript":
        System.out.println("JavaScript is blah blah");
        break;
    }

    System.out.println(7/2); // 3
    System.out.println(7%2); // 1
  }
}
