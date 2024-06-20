package WeeklyQuiz2;

import java.time.LocalDate;

public class Test {
  public static void main(String[] args) {
    ShoppingMall mall = new PremiumShoppingMall();

    Clothing jacket = new Clothing("Jacket", 1000, 3, "L");
    Electronics tv = new Electronics("TV", 5000, 4, "Samsung");
    Food pizza = new Food("Pizza", 30, 50, LocalDate.of(2024, 6, 22));

    mall.addProduct(jacket);
    mall.addProduct(tv);
    mall.addProduct(pizza);

    System.out.println("Products in stock: ");
    mall.displayProducts();

    System.out.println("======================");
    System.out.println("Order Availability: " + mall.checkOrderAvailability());
  }
}
