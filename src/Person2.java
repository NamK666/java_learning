public class Person2 {
    // 멤버 변수
    String name;
    int age;
    static final String health = "healthy";
    static String gender = "male";

    // 생성자
    public Person2(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender= gender;
    }

    public void sayHello(){
    System.out.println("안녕하세요, 제 이름은 " + name);
    }
    public void sayAge(){
    System.out.println("안녕하세요, 제 나이는 " + age);
    }
}
