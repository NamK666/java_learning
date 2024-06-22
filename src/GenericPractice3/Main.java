package GenericPractice3;

public class Main {
  public static void main(String[] args) {
    Car<String>car = new Car<>();
    car.setModel("Tesla Model 3");

    String carModel = car.getModel();
    System.out.println("my car is " + carModel);
  }
}
