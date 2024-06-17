package SetterPractice;

public class motorcar {
  private int speed;

  public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
    } else {
      this.speed = speed;
    }
  }

  public void checkSpeed() {
    System.out.println("현재 스피드: " + this.speed);
  }
}
