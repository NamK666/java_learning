package InheritPractice6;

public class Computer extends Calculator{
    @Override
    double areaCircle(double radius) {
        return super.areaCircle(radius);
    }

    @Override
    void say() {
    System.out.println("안녕하소");
    }
}
