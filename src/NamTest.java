public class NamTest {
  public static void main(String[] args) {
    NamKyung namKyung1 = new NamKyung(63, 9000,false);
    NamKyung namKyung2 = new NamKyung(100, 5000,false);
    Food food = new Food(50, 30, "사탕");

    namKyung1.buyFood(food);
    namKyung1.eatFood(food);

    System.out.println(namKyung1.money);
    System.out.println(namKyung1.weight);
    System.out.println(namKyung1.fat);
  }
}
