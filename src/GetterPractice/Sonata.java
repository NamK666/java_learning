package GetterPractice;

public class Sonata {
  private int speed;
  private boolean stop;

  void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
      return;
    } else {
      this.speed = speed;
    }
  }

  public int getSpeed() {
    return this.speed;
  }

  public boolean isStop() {
    return this.stop;
  }

  public void setStop(boolean stop) {
    this.stop = stop;
  }

  public static void main(String[] args) {
    Sonata sonata = new Sonata();
    sonata.setSpeed(60);
    System.out.println("변경 후 속도: " + sonata.getSpeed());

    if(!sonata.isStop()) {
      sonata.setStop(true);
    }
  }
}
