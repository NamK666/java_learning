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
    String format = String.format("%s의 나이는 %s세 입니다.",name1,age1);
    System.out.println(format);

    StringBuilder sb = new StringBuilder();
    sb.append("Happy");
    sb.append("Draco");
    sb.append("World");
    System.out.println(sb); // HappyDracoWorld
  }
}
