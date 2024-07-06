package ThreadPractice;

public class MyRunnable implements Runnable {
  private int number;

  public MyRunnable(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    System.out.println("run메소드 실행: " + this.number);
  }
}
