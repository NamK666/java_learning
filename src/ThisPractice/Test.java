package ThisPractice;

public class Test {
    public static void main(String[] args){
        NamKyung namKyung = new NamKyung(64,9999999,false);
        NamKyung draco = new NamKyung(80,9999999,false);
        Food pizza = new Food(10,1,"pizza");
        Food hamburger = new Food(7,1,"hamburger");

        namKyung.buyFood(pizza);
        namKyung.eatFood(pizza);
        namKyung.myStatus();
        namKyung.buyFood(hamburger);
        namKyung.eatFood(hamburger);
        namKyung.myStatus();
    }
}
