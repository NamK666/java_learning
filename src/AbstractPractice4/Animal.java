package AbstractPractice4;

public abstract class Animal {
    protected String kind;

    public void breath(){
    System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();
}
