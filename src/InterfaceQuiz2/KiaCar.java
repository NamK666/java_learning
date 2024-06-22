package InterfaceQuiz2;

public class KiaCar implements Car {
    @Override
    public String showEngine() {
        return "기아 엔진";
    }

    @Override
    public int amountNavi() {
        return 10000;
    }

    @Override
    public String getTire() {
        return "기아 타이어";
    }
}
