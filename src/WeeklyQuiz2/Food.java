package WeeklyQuiz2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends Product {
  private LocalDate expirationDate;

  public Food(String name, int price, int stock, LocalDate expirationDate) {
    super("Pizza", 30, 50);
    this.expirationDate = expirationDate;
  }

  @Override
  public int calculatePrice() {
    int calculatedPrice = super.calculatePrice();
    long daysUntilExpiration = ChronoUnit.DAYS.between(LocalDate.now(), expirationDate);
    if (daysUntilExpiration <= 7) {
      calculatedPrice *= 0.8;
    }
    return calculatedPrice;
  }
}
