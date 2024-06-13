public class MainPhone {
    public static void main(String[] args){
        SmartPhone smartPhone = new SmartPhone("이남경");

        smartPhone.turnOn(); // 폰전원을 킵니다.
        smartPhone.turnOff(); // 폰전원을 끕니다.
        smartPhone.internetSearch(); // 인터넷 검색을 합니다.
    }
}
