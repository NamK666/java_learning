package ThreadClassInherit;

public class MyThread extends Thread {
  public void run() {
    System.out.println("쓰레드 클래스 상속");
    super.run();
  }
}
