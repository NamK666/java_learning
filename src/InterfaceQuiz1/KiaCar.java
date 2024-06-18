package InterfaceQuiz1;

public class KiaCar implements Car {
    @Override
    public String showEngine() {
        return "독일 엔진";
    }

    @Override
    public int amountNavi() {
        return 920000;
    }

    @Override
    public String getTier() {
        return "한국 타이어";
    }
}
