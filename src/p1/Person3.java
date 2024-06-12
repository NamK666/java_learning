package p1;

public class Person3 {
  // 멤버 변수
  String name;
  int age;
  static final String gender = "남";
  static final String health = "healthy";

  // 생성자
  public Person3(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 메서드
  public void sayHello() {
    System.out.println("Hello, my name is " + this.name);
  }
  public void introduce() {
    System.out.println("I am " + this.age + " years old.");
  }

  protected void testMethod(){
    System.out.println("test");
  }
}
