public class Dog1 extends Animal{

    // 여기서 Dog1가 실체 클래스이고
    // Animal이 추상 클래스이다.
   public Dog1(){
       this.kind = "포유류";
   }

    @Override
    public void sound() {
    System.out.println("월월");
    }
}
