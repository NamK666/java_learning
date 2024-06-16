public class MainNamKyungs {
  public static void main(String[] args) {
    NamKyungs namKyung1 = new NamKyungs(63, 4000, false);
    NamKyungs namKyung2 = new NamKyungs(80, 50, true);

    Foodie foodie = new Foodie(3, 1, "chocolate");

    namKyung1.buyFood(foodie);
    namKyung2.eatFood(foodie);

    System.out.println(namKyung1.money);
    System.out.println(namKyung1.weight);
    System.out.println(namKyung1.fat);
  }
}
