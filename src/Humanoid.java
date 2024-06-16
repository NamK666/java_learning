public class Humanoid {
  String name;
  int phoneNum;
  int money;
  int age;

  public Humanoid(String name, int phoneNum, int money, int age) {
    this.name = name;
    this.phoneNum = phoneNum;
    this.money = money;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("my name is " + name);
  }

  public void sayMoney() {
    System.out.println("나는 " + money + "달러 갖고있어.");
  }
}
