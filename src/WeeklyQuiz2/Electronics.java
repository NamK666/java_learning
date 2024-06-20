package WeeklyQuiz2;

public class Electronics extends Product{
    private String brand;

    public Electronics(String name, int price, int stock, String brand) {
        super("TV", 5000, 4);
        this.brand = brand;
    }

    @Override
    public int calculatePrice() {
        int calculatedPrice = super.calculatePrice();
        if(brand.equals("Apple")){
            calculatedPrice *= 1.2;
        }
        return calculatedPrice;
    }
}
