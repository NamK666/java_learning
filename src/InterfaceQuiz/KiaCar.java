package InterfaceQuiz;

public class KiaCar implements Car{
    @Override
    public String showEngine() {
    return "독일 엔진";
    }

    @Override
    public int amountNavi() {
    return 1000000;
    }

    @Override
    public String getTire() {
    return "한국 타이어";
    }
}