package OverridePractice1;

public class Main {
  public static void main(String[] args) {
    Computer computer = new Computer();
    Calculator calculator = new Calculator();

    System.out.println(computer.areaCircle(3));
    System.out.println(calculator.areaCircle(3));
  }
}
