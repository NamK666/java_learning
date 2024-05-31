public class day2 {
  public static void main(String[] args) {

    String firstName = "NamKyung"; // String이 기본적으로 갖고있는 메소드(행동)가 있을 것임.
    String secondName = "Lee";
    String phone = "iphone";
    String status = "tired";
    System.out.println("나는 " + secondName + firstName + "입니다.");
    System.out.println(phone + " is " + status);

    System.out.println(firstName.toUpperCase()); // NAMKYUNG
    System.out.println(firstName.toLowerCase()); // namkyung
    System.out.println(firstName == secondName); // false

    String a = "hello";
    String b = new String("hello");
    System.out.println(a.equals(b)); // true
    System.out.println(a==b); // false ( a와 b가 똑같은 문자이긴하지만, 서로 다른 객체라서 그럼 ) (참조타입이기에, 메모리의 주소를 비교하기 때문에)

    String c = "Hello World!";
    System.out.println(c.indexOf("!")); // 11 (index는 첫글자가 0부터 시작함)
    System.out.println(c.indexOf("g")); // -1 (글자가 없기 때문에)
    System.out.println(c.indexOf("l")); // 2 (첫번째 나오는 것의 순서로 출력)

    String d = "Hello Nam!";
    System.out.println(d.contains("Hello")); // true (포함하고 있으니)

    String e = "What is your hobby";
    System.out.println(e.charAt(5)); // i (5번째에 있는 문자 반환)
    System.out.println("" + e.charAt(13) +""+ e.charAt(14) +""+ e.charAt(15) +""+ e.charAt(16) +""+ e.charAt(17)); // hobby (중간에 ""(문자열)를 넣음으로써 자동으로 문자열로 바꾸는 것)

    System.out.println(e.replaceAll("hobby","java")); // What is your java

    String f = "Hello World! Hello World! Hello World!";
    System.out.println(f.replaceAll("World","Nam")); // Hello Nam! Hello Nam! Hello Nam! (All: 전부 다 바꾸기)
    System.out.println(f.replaceFirst("World","Nam")); // Hello Nam! Hello World! Hello World! (첫번째 문자만 바꾸기)

    String g = "WEEEE ASKE ;ND";
    System.out.println(g.substring(0,5)); // WEEEE *주의: 끝 위치에서 +1 시켜줘야함.
    System.out.println(g.substring(0,3)+g.substring(8,10)+g.substring(12,14)); // WEEKEND

    String h = "a:b:c:d";
    String[] split = h.split(":");

    String i = "Hello";
    System.out.println(i.concat("!")); // Hello! (concat은 영구적으로 바꾸는것임)
    System.out.println(i+"!"); // Hello!

    String name1 = "Tim";
    int age1 = 30;
    String name2 = "Anna";
    int age2 = 45;
    String format = String.format("%s의 나이는 %s세 입니다", name1, age1);
    String format1 = String.format("%s의 나이는 %s세 입니다", name2, age2);
    System.out.println(format); // Tim의 나이는 30세 입니다
    System.out.println(format1); // Anna의 나이는 45세 입니다



    String result = "";
    result += "Hello";
    result += "Java";
    result += "World";
    System.out.println(result); // HelloJavaWorld

    StringBuilder sb = new StringBuilder();
    sb.append("Hello "); //append : 추가하다 (간단한 문자열은 String으로 하는데, 문자열을 이어붙이는 것은 무조건 StringBuilder of Buffer)
    sb.append("java");
    sb.append("World");
    System.out.println(sb); // Hello javaWorld

    StringBuffer sf = new StringBuffer();
    sf.append("Hello ");
    sf.append("java");
    sf.append("World");
    System.out.println(sf); // Hello javaWorld

    StringBuffer hi = new StringBuffer();
    hi.append("Hello");
    hi.insert(2,"World");
    hi.insert(2,"World");
    hi.insert(2,"World");
    hi.insert(2,"World");
    System.out.println(hi); // HeWorldWorldWorldWorldllo

    // 100개의 원소를 가진 정수 배열란을 만드시오 //
    int[] arr = new int[100];
    System.out.println(arr); // [I@153f5a29 <- 메모리 주소값임. (참조타입)
    System.out.println(arr[0]); // 0 (0값으로 초기화됨)

    // 문자열 1000개 //
    String[] arr2 = new String[1000];
    System.out.println(arr[0]);

    int[] arr3 = {1,2,3};
    System.out.println(arr3[2]); // out of bound 발생 (3이 없기에)

    int positive = 10;
    int negative = -10;
    System.out.println("양의 부호 연산자 적용: "+ (+positive)); // 10
    System.out.println("음의 부호 연산자 적용: "+ (-positive)); // -10
    System.out.println("음의 부호 연산자로 부호 반전: "+ (+negative)); // -10
    System.out.println("음의 부호 연산자로 다시 부호 반전: "+ (-negative)); // 10


  }
}
