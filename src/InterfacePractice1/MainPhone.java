package InterfacePractice1;

public class MainPhone {
    public static void main(String[] args){
        Phone samsungPhone = new SamsungPhone();
        Phone applePhone = new ApplePhone();

    System.out.println(samsungPhone.call());
    System.out.println(applePhone.call());

    System.out.println(samsungPhone.answerThePhone());
    System.out.println(applePhone.answerThePhone());
    }
}
