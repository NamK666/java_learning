package TypeParameter;

public class Quiz1 {
    public static void main(String[] args){
    System.out.println(compareString("hello","hello"));
    }

    public static <T extends String> String compareString(T t1, T t2){
        String s1 = t1.toString();
        String s2 = t2.toString();
        return s1.equals(s2) ? "okay" : "no";
    }
}