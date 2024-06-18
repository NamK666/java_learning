package InterfacePractice2;

public class ImplementsC implements InterfaceC{
    @Override
    public void methodC() {
    System.out.println("c 메소드 실행");
    }

    @Override
    public void methodA() {
    System.out.println("a 메소드 실행");
    }

    @Override
    public void methodB() {
    System.out.println("b 메소드 실행");
    }
}
