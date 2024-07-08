package LspPractice;

public class Main {
  public static void main(String[] args) {
    FlyingBird flyingBird = new FlyingBird();
    flyingBird.breath();
    flyingBird.fly();

    Animal animal = new Penguin(); // 이건 왜하는거?
    animal.breath();
  }
}
