package GenericPractice1;

public class MainCar {
  public static void main(String[] args) {
    Car<String> car = new Car<String>();
    car.setModel("bmw");

    String carModel = car.getModel();
    System.out.println(carModel);
  }
}
