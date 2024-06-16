public class Person30 {
  String name;
  int age;

  public Person30(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("hello, my name is " + this.name);
  }
  public void introduce(){
    System.out.println("I am " + this.age + " years old.");
  }
}
