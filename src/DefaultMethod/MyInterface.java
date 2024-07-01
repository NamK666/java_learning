package DefaultMethod;

public interface MyInterface {
    void abstractMethod();

    default void defaultMethod() {
    System.out.println("This is default method");
    }
}
