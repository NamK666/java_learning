package SleepTesting;

public class MyRunnable implements Runnable{
    private int number;

    public MyRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
    System.out.println("테스팅: " + this.number);
    }
}
