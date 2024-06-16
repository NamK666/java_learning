public class NamKyungs {
  int weight;
  int money;
  boolean fat;

  public NamKyungs(int weight, int money, boolean fat) {
    this.weight = weight;
    this.money = money;
    this.fat = false;
  }

  public void buyFood(Foodie foodie) {
    this.money -= foodie.cost;
  }

  public void eatFood(Foodie foodie) {
    this.weight -= foodie.weight;
    if (this.weight >= 75) {
      this.fat = true;
    }
  }
}
