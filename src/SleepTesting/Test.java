package SleepTesting;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable(1));
        Thread thread2 = new Thread(new MyRunnable(2));
        Thread thread3 = new Thread(new MyRunnable(3));

        thread1.start();
        thread2.start();
        Thread.sleep(10000);
        thread3.start();
    }
}
