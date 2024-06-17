package InheritPractice1;

public class Child extends Parent {

    void invest(){
        money -= 1000;
    System.out.println("투자 후 남은 금액은 총 " + money + "원 입니다.");
    }
}
