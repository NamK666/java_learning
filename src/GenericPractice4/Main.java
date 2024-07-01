package GenericPractice4;

public class Main {
    public static void main(String[] args){
        Box<Integer> box = Util.boxing(100);
        int intValue = box.getT();
    }
}
