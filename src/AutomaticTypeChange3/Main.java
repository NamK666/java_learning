package AutomaticTypeChange3;

public class Main {
	public static void main(String[] args){
		Driver driver = new Driver();

		Vehicle taxi = new Taxi();
		Vehicle bus = new Bus();

		driver.drive(taxi);
		driver.drive(bus);
	}
}
