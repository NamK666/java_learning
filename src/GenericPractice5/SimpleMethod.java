package GenericPractice5;

public class SimpleMethod {
    public static <T> void printValue(T value){
    System.out.println("값: " + value);
    }

    public static void main(String[] args){
        printValue(10);
        printValue("안녕");
    }
}
