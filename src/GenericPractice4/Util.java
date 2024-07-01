package GenericPractice4;

public class Util {
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }
}
