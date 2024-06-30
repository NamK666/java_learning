package SetterPractice1;

public class MainCar {
    public static void main(String[] args){
        Car car = new Car();

        car.setSpeed(100);
        car.checkSpeed();

        car.setSpeed(-10);
        car.checkSpeed();

    }
}
