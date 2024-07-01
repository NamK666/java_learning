package GenericPractice4;

import org.w3c.dom.ls.LSOutput;

public class GenericMethodEx {
  public static <T> void printArray(T[] array) {
    for (T element : array) {
      System.out.println(element + " 뭐야 1 ");
    }
    System.out.println(" 뭐야 2 ");
  }

  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
    String[] stringArray = {"Hello", "World"};

    System.out.println("정수 배열: ");
    printArray(intArray);
  }
}
