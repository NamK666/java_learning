package ClassPractice;

public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello, my name is " + this.name);
  }

  public void introduce() {
    System.out.println("I'm " + this.name + " and I'm " + this.age + "years old");
  }
}
