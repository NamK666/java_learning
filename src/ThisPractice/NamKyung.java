package ThisPractice;

public class NamKyung {
  int weight;
  int money;
  boolean fat;

  public NamKyung(int weight, int money, boolean fat) {
    this.weight = weight;
    this.money = money;
    this.fat = fat;
  }

  public void buyFood(Food food) {
    this.money -= food.cost;
  }

  public void eatFood(Food food) {
    this.weight += food.weight;
    if (this.weight >= 100) {
      this.fat = true;
    }
  }

  public void myStatus(){
    System.out.println("weight: " + this.weight + " money: " + this.money);
  }
}
