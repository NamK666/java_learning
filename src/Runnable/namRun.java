package Runnable;

public class namRun implements Runnable {
  private int number;

  public namRun(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    System.out.println(this.number);
  }
}
