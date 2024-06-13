public class Computer extends Calculator{

    @Override // cmd+n으로 생성
    double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle메서드 실행");
        return Math.PI * r * r;
    }

    @Override
    void say() {
    System.out.println("안녕하소");
    }
}
