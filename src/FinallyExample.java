import java.util.Scanner;

public class FinallyExample {

  public static void main(String[] args){
    try{
      int[] numbers = {1,2,3};
      System.out.println(numbers[5]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("배열의 인덱스를 벗어났습니다.");
    }
  }
}
