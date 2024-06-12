public class SangSu {
    String hometown = "Busan";
    int age = 40;
    static final String NAME = "정상수";
    static final boolean CRIME = true;

    public SangSu(String hometown, int age){
        this.hometown = hometown;
        this.age = age;
    }

    public void sayHello(){
    System.out.println("안녕, 나는 "+NAME+"라고 해.");
  }
}
