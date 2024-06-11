public class Testing {
  public static void main(String[] args) {
    Person person1 = new Person ("이남경",01,999999999,30);
    person1.sayHello();
    person1.sayMoney();
    Person person2 = new Person ("Draco",01012341234,9999999,30);
    Person person3 = new Person ("rick",010231321,9999999,30);

    Student student = new Student();
    person2.teaching(student);
    person3.cheating(student);
  }
}
