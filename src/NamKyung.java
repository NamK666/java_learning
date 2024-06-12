public class NamKyung {
    // 멤버 변수
    int weight;
    int money;
    boolean fat;

    // 생성자
    public NamKyung(int weight, int money, boolean fat){
        this.weight = weight;
        this.money = money;
        this.fat = false;
    }

    // 메소드
    public void buyFood(Food food){
        this.money -= food.cost;
    }
    public void eatFood(Food food){
        this.weight += food.weight; // food의 중량 만큼 내 몸무게가 증가
        if(this.weight>=150){
            this.fat=true;
        }
    }



}
