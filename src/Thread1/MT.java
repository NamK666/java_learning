package Thread1;

public class MT extends Thread {
  private String name;

  public MT(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println(this.name);
    super.run();
  }
}
