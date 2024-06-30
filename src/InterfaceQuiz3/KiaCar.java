package InterfaceQuiz3;

public class KiaCar implements Car {
  @Override
  public String getTire() {
    return "이탈리아 타이어";
  }

  @Override
  public int amountNavi() {
    return 100000;
  }

  @Override
  public String showEngine() {
    return "독일 엔진";
  }
}
