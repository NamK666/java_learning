package StrongRelated;

public class CoffeeShop {
  public static void main(String[] args) {
    CoffeeMachine coffeeMachine = new CoffeeMachine();

    Barista barista = new Barista(coffeeMachine);

    barista.makeEspresso();
    // 바리스타가 에스프레소를 만듭니다.
    // 에스프레소를 내립니다.
  }
}
