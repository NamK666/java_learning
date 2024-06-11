public class Student {
    int level; // 멤버 변수

    //생성자
    public Student(){
        this.level=1;
    }

    // 메서드 (기능)
    public void levelUp(){
        level++;
    System.out.println("레벨이 1증가 했습니다.");
    System.out.println("현재 레벨은 =" + level +" 입니다.");
    }

    public void levelDown(){
        level--;
    System.out.println("레벨이 1감소 했습니다.");
    System.out.println("현재 레벨은 =" + level +" 입니다.");
    }
}
