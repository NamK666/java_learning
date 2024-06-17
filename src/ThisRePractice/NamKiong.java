package ThisRePractice;

public class NamKiong {
  // 멤버변수
  int weight;
  int money;
  boolean fat;

  // 생성자 (값초기화해주기)
  public NamKiong(int weight, int money, boolean fat) {
    this.weight = weight;
    this.money = money;
    this.fat = false;
  }

  // 메소드
  public void eatSnack(Snack snack) {
    this.weight += snack.weight;
    if (this.weight >= 100) {
      this.fat = true;
    }
  }
  public void buySnack(Snack snack) {
    this.money -= snack.cost;
  }
}
