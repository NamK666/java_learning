package DefaultMethod;

public class MyOverridingClass implements MyInterface {
  @Override
  public void abstractMethod() {
    System.out.println("Implementing abstract method");
  }

  @Override
  public void defaultMethod() {
    System.out.println("Overriding default method");
  }

  MyOverridingClass obj = new MyOverridingClass();
}

