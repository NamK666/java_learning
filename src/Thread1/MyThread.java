package Thread1;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("오늘 데일리퀴즈는 0문제");
    super.run();
  }
}
