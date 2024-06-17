public class StringB {
  public static void main(String[] args) {

    String result = "";
    result += "Hello";
    result += " Java";
    result += " World!";
    System.out.println(result);

    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    sb.append(" Draco");
    sb.append(" World!");
    System.out.println(sb);

    StringBuffer sf = new StringBuffer();
    sf.append("Happy");
    sf.append(" Draco's");
    sf.append(" Day!");
    System.out.println(sf);
  }
}
