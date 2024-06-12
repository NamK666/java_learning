public class Person2 {
    // 멤버 변수
    String name;
    int age;
    static fianl String gender = "남";
    static final String health = "healthy"

    // 생성자
    public Person2(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = "남자";
    }

    public void sayHello(){
    System.out.println("안녕하세요, 제 이름은 " + name);
    }
    public void sayAge(){
    System.out.println("안녕하세요, 제 나이는 " + age);
    }
    public void sayGender(){
    System.out.println("안녕하세요, 저의 성별은 " + gender);
    }
}
