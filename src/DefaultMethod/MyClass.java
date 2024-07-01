package DefaultMethod;

public class MyClass implements MyInterface{
    @Override
    public void abstractMethod() {
    System.out.println("Implementing abstract method");
    }

    public void callDefaultMethod(){
        defaultMethod();
    }
}

