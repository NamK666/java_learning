package ThreadPractice;

public class MyThread2 extends Thread {
  private String name;

  public MyThread2(String name) {
    this.name = name;
  }

  public void run() {
    System.out.println(this.name);
  }
}
