package Phone;

public class MainPhone0 {
    public static void main(String[] args){
        Phone0 applePhone = new ApplePhone();
        Phone0 samsungPhone = new SamsungPhone();

    System.out.println(applePhone.call());
    System.out.println(samsungPhone.call());

    System.out.println(applePhone.answerThePhone());
    System.out.println(samsungPhone.answerThePhone());
    }
}
