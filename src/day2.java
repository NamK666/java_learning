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


  }
}
