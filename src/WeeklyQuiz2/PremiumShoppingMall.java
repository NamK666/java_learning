package WeeklyQuiz2;

public class PremiumShoppingMall extends ShoppingMall {
    @Override
    public boolean checkOrderAvailability() {
        for (Product product : getProducts()){
            if (product.getStock()<10){
                return false;
            }
        }
        return true;
    }
}
