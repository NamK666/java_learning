public class Person1 {
    // 변수
    String name;
  int phoneNum;
  int money;
  int age;

  // 생성자 (규칙: 즉 여기서 Person1은 클래스 이름 Person1과 동일해야 한다)
  public Person1(String name, int phoneNum, int money, int age) {
    this.name = name;
    this.phoneNum = phoneNum;
    this.money = money;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello, my name is " + name);
  }

}
