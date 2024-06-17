package ThisReRePractice;

public class Lee {
  String name;
  int age;

  public Lee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello, my name is " + this.name);
  }

  public void sayAge() {
    System.out.println("I am " + this.age + " years old");
  }
}
