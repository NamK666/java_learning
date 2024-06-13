public class Cat extends Animal{

    //여기서 Cat은 실체 클래스
    public Cat(){
        this.kind = "포유류";
    }

    @Override
    public void sound() {
    System.out.println("meow");
  }
}
