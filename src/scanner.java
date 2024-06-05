import java.util.Scanner;               // "자바 밑에 있는 util밑에 있는 스캐너만 쓸거야"

public class scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);     // // scanner도 클래스니까 참조타입임 그래서..

    System.out.println("1~4 사이의 숫자를 입력해주세요.");
    int number = sc.nextInt(); // 숫자를 입력받고 싶을 때 넥스트인트
    switch(number){
        case 1:
        System.out.println("봄");
        break;
        case 2:
        System.out.println("여름");
        break;
        case 3:
        System.out.println("가을");
        break;
        case 4:
        System.out.println("겨울");
        break;
        default:
        System.out.println("1~4사이의 숫자를 다시 입력하시오.");
        break;
    }

    sc.nextLine(); // 문자열을 입력받고싶을 때 넥스트라인
    System.out.println("문자열을 입력하세요:");

    // sc.nextLine() 에서 알트 앤터치고 지역변수 삽입
        String line = sc.nextLine();

    System.out.println("정수는 =" +number);
    System.out.println("문자열은 =" +line);

        sc.close(); // 위에 Scanner sc = new Scanner(System.in); 는  sc에 input을 물린 것임.
                // 그래서 코드가 끝나도 input과 연동되어 있음. 그래서 마지막에 close로 끊어줘야함.

  }
}
