package Practice;

import java.util.Arrays;

public class selfpractice {
  public static void main(String[] args) {
    String a = "happy";
    String b = new String("happy");
    System.out.println(a.equals(b)); // true
    System.out.println(a == b); // false

    char c = 'j';
    char d = '1';
    System.out.println(c);
    System.out.println(d);

    String e = "";
    System.out.println(e);

    long f = 7123214124124L;
    System.out.println(f);

    float g = 3.14f;
    System.out.println(g);

    double h = 10.574;
    int i = (int) h;
    System.out.println(i);

    long j = 98749358234L;
    int k = (int) j;
    System.out.println(k);

    String strtesting = "스트링 시험해보자";
    String strtesting2 = new String("스트링 뉴 시험");
    System.out.println(strtesting); // 스트링 시험해보자
    System.out.println(strtesting2); // 스트링 뉴 시험
    System.out.println(strtesting.equals(strtesting2)); // false

    String starboy = "선언";
    String starboy2 = new String("선언");
    System.out.println(starboy.equals(starboy2)); // true (문자값 그대로 비교)
    System.out.println(starboy == starboy2); // false (주소값 비교)

    String indextesting = "Hello World";
    System.out.println(indextesting.indexOf("")); // 0
    System.out.println(indextesting.lastIndexOf("orld")); // 7

    String replacetest = "Draco World";
    System.out.println(replacetest.replaceAll("Draco", "NamKyung"));
    System.out.println(replacetest.replaceFirst("Draco", "NamKyung"));

    String substringtest = "dr123a45c42o";
    System.out.println(
        substringtest.substring(0, 2)
            + substringtest.substring(5, 6)
            + substringtest.substring(8, 9)
            + substringtest.substring(11, 12)); // draco

    String splittest = "a:b:c:d:e";
    String[] split = splittest.split(":");
    String split2 = new String(split[4]);
    System.out.println(split2);

    String app = "apple banana cherry";
    String[] fruits = app.split(" ");
    System.out.println(fruits); // [Ljava.lang.String;@17550481 메모리 주소값
    System.out.println(Arrays.toString(fruits)); // [apple, banana, cherry]

    String concattest = "apple";
    System.out.println(concattest.concat(" banana"));

    String name1 = "Nam";
    int age1 = 25;
    String name2 = "Draco";
    int age2 = 30;
    String format = String.format("%s의 나이는 %s세 입니다.", name1, age1);
    System.out.println(format);

    StringBuilder sb = new StringBuilder();
    sb.append("Happy");
    sb.append("Draco");
    sb.append("World");
    System.out.println(sb); // HappyDracoWorld

    // 삼항 연산자 //
    // 90점 이상이고, 5의 배수 일때 문자열 good, 아니라면 bad 를 입력하시오 //
    int score = 90;
    String grade = (score >= 90 && score % 5 == 0) ? "good" : "bad";
    System.out.println(grade); // good

    // 75점 이상이고, 10의 배수 일때 문자열 A, 아니라면 F 를 입력하시오 //
    int score1 = 80;
    char G = (score1 >= 75 && score1 % 10 == 0) ? 'A' : 'F';
    System.out.println(G); // A

    // if문 //
    int aa = 10;
    int bb = 17;
    if (aa > bb) {
      System.out.println("aa가 bb보다 크다");
    } else if (aa == bb) {
      System.out.println("aa와 bb가 같다");
    } else {
      System.out.println("aa가 bb보다 작다");
    }
    // 위 if문을 삼항 연산자로 //
    String ifresult = (aa > bb) ? "aa가 bb보다 크다" : (aa == bb) ? "aa와 bb가 같다" : "aa가 bb보다 작다";
    System.out.println(ifresult);

    // 변수 xx에 10이 저장되어 있습니다. x가 양수인지, 음수인지, 아니면 0인지를 판별하는 코드를 작성하세요. (삼항연산자) //
    int xx = 10;
    char xxStatus = (xx > 0) ? '+' : (xx == 0) ? '0' : '-';
    System.out.println(xxStatus); // +

    // 변수 sco에 75가 저장되어 있습니다. sco에 따라 학점을 출력하는 코드를 작성하세요.
    int sco = 75;
    if (sco >= 90) {
      System.out.println("A");
    } else if (sco >= 80 && sco < 90) {
      System.out.println("B");
    } else if (sco >= 70 && sco < 80) {
      System.out.println("C");
    } else {
      System.out.println("F");
    }
    // 위 조건을 삼항 연산자로! //
    char scoGrade =
        (sco >= 90) ? 'A' : (sco >= 80 && sco < 90) ? 'B' : (sco >= 70 && sco < 80) ? 'C' : 'F';
    System.out.println(scoGrade);

    // 변수 year에 2023이 저장되어 있습니다. year가 윤년인지 아닌지를 판별하는 코드를 작성하세요. //
    // 윤년의 조건: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수인 해 //
    int year = 2023;
    String isYeapYear =
        (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "윤년입니다" : "윤년이 아닙니다";
    System.out.println(isYeapYear);

    // 변수 aA에 10, bB에 20, cC에 30이 저장되어 있습니다. 세 변수 중 가장 큰 값을 출력하는 코드를 작성하세요. //
    int aA = 10;
    int bB = 20;
    int cC = 30;
    if (aA > bB && aA > cC) {
      System.out.println(aA);
    } else if (bB > aA && bB > cC) {
      System.out.println(bB);
    } else {
      System.out.println(cC);
    }

    // 퀴즈 2 //
    boolean xX = true;
    boolean yY = false;
    boolean zZ = true;
    if (xX && !yY) {
      System.out.println("조건 1 충족");
    } else if ((yY && zZ) || (!xX && !zZ)) {
      System.out.println("조건 2 충족");
    } else if (xX || yY || zZ) {
      System.out.println("적어도 하나는 참");
    } else if (!xX && !yY && !zZ) {
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
        System.out.println("알 수 없는 숫자입니다.");
        break;
    }
    // Switch 문 요일 문제 실습 //
    String day = "Tuesday";
    switch (day) {
      case "Monday":
        System.out.println("월요일입니다.");
        break;
        case "Tuesday":
        System.out.println("화요일입니다.");
        break;
        case "Wednesday":
        System.out.println("수요일입니다.");
        break;
      default:
        System.out.println("너 알아서해라");
        break;
    }

    // 퀴즈 1 //
    char gradE = 'A';
    switch (gradE) {
      case 'A':
        System.out.println("Excellent");
        break;
        case 'B':
        System.out.println("Good");
        break;
        case 'C':
        System.out.println("average");
        break;
        case 'D':
        System.out.println("Below average");
        break;
      case 'F':
        System.out.println("Fail");
        break;
    }

    // 문제 4 //
    int scorE = 85;
    switch (scorE / 10) {
      case 10, 9:
        System.out.println("A");
        break;
        case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      default:
        System.out.println("F");
        break;
    }
  }
}
