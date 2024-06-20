package WeeklyQuiz2;

import java.util.ArrayList;

public abstract class ShoppingMall {
  private ArrayList<Product> products;

  // 생성자
  public ShoppingMall() {
    products = new ArrayList<>();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product, String name) {
    if (product.getName().equals(name)) {
      products.remove(product);
    }
  }

  public void displayProducts() {
    for (Product product : products) {
      System.out.println(
          "Name: "
              + product.getName()
              + ", Price: "
              + product.getPrice()
              + ", Stock: "
              + product.getStock());
    }
  }

  public abstract boolean checkOrderAvailability();

  protected ArrayList<Product> getProducts(){
    return products;
  }
}
