package ThisRePractice;

public class MainNamKiong {
  public static void main(String[] args) {
    NamKiong namKiong1 = new NamKiong(63, 9999999, false);
    NamKiong namKiong2 = new NamKiong(83, 99999999, true);

    Snack snack = new Snack(100, 1, "candy");

    namKiong1.eatSnack(snack);
    namKiong1.eatSnack(snack);
    namKiong1.buySnack(snack);

    System.out.println(namKiong1.weight);
    System.out.println(namKiong1.money);
  }
}
