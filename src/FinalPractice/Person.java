package FinalPractice;

public class Person {
  String name;
  int age;
  final String gender = "남";

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void introduce() {
    System.out.println("Hi, My name is " + this.name + " and I am " + this.age + " years old.");
  }
}
