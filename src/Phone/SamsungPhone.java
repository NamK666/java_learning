package Phone;

public class SamsungPhone implements Phone0{

    @Override
    public String call() {
        return "삼성폰이 전화를 겁니다.";
    }

    @Override
    public String answerThePhone() {
        return "삼성폰이 전화를 받습니다.";
    }
}
