package TypeParameterPractice;

public class SimplizedVer {
  public static void main(String[] args){
    compareString("hello","hello");
  }

  public static <T extends String> void compareString(T a, T b) {
    System.out.println(a.equals(b) ? "okay" : "no");
  }
}
