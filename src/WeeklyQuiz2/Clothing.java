package WeeklyQuiz2;

public class Clothing extends Product {
  private String size;

  public Clothing(String name, int price, int stock, String size) {
    super("Jacket", 1000, 3);
    this.size = size;
  }

  @Override
  public int calculatePrice() {
    int calculatedPrice = super.calculatePrice();
    if (size.equals("L")||size.equals("XL")||size.equals("XXL")) {
      calculatedPrice *= 1.1;
    }
    return calculatedPrice;
  }
}
