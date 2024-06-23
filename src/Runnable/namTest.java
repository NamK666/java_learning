package Runnable;

public class namTest {
  public static void main(String[] args) {
    Thread thread1 = new Thread(new namRun(1));
    Thread thread2 = new Thread(new namRun(20));
    Thread thread3 = new Thread(new namRun(300));

    thread1.start();
    thread2.start();
    thread3.start();
  }
}
