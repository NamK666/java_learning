public class LeeNamKyung {
    String name = "이남경";
    String nickname = "draco";
    int age = 30;
    String hobby = "Watching Movies";

    public LeeNamKyung(String name, String nickname, int age, String hobby){
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.hobby = hobby;
    }

    public void myName(){
    System.out.println("제 이름은 " + name + "입니다.");
    }
    public void myNickname(){
    System.out.println("저의 닉네임은 " + nickname + "입니다.");
    }
    public void myAge(){
    System.out.println("저의 나이는 " + age + "세 입니다.");
    }
    public void myHobby(){
    System.out.println("저의 취미는 " + hobby + "입니다.");
    }
}
