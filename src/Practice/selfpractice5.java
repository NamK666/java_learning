package Practice;

public class selfpractice5 {

  static String getMiddleThree(String sentence) {
    int length = sentence.length();

    if (length < 3) {
      return sentence;
    }
    if (length % 2 != 0) {
      int middleIndex = length / 2;
      return sentence.substring(middleIndex - 1, middleIndex + 2);
    }
    else {
      return sentence;
    }
  }

  public static void main(String[] args) {
    System.out.println(getMiddleThree("Monitor"));
    System.out.println(getMiddleThree("namkyung"));
  }
}
