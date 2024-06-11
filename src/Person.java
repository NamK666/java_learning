public class Person {

  // 변수
  String name;
  int phoneNumber;
  int money;
  int age;

  // 생성자 (규칙 즉 여기서 Person은 class이름 즉 Person과 동일해야한다)
  public Person(String name, int phoneNumber, int money, int age) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.money = money;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("my name is " + name);
  }

  public void sayMoney() {
    System.out.println("내가 갖고 있는 금액은 " + money + "원 입니다.");
  }
  public void teaching(Student student){
      student.levelUp();
  }
  public void cheating(Student student){
      student.levelDown();
  }

}
