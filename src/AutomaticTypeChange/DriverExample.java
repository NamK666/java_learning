package AutomaticTypeChange;

public class DriverExample {
    public static void main(String[] args){
        Driver driver = new Driver();
        Vehicle taxi = new Taxi();
        Vehicle bus = new Bus();

        driver.drive(bus); // 버스가 달립니다.
        driver.drive(taxi); // 택시가 달립니다.

    }
}
