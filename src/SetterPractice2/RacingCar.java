package SetterPractice2;

public class RacingCar {
  private int speed;
  private int gear;

  public void setSpeed(int speed) {
    if (this.speed < 0) {
      this.speed = 0;
      return;
    }
    this.speed = speed;

    if (speed <= 30) {
      this.gear = 1;
    } else if (speed <= 70) {
      this.gear = 2;
    } else {
      this.gear = 3;
    }
  }
  public void showGear(){
    System.out.println("현재 기어: " + this.gear);
  }
}
