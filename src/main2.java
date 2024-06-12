public class main2 {
    public static void main(String[] args){
        Person2 person1 = new Person2("이남경",30, "남자");
        Person2 person2 = new Person2("드라코",25, "남자");
        Person2 person3 = new Person2("케이닷",35, "여자");

        person1.sayAge();
        person1.sayHello();

        person3.sayGender(); //
    }
}
