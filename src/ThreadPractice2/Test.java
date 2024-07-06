package ThreadPractice2;

public class Test {
    public static void main(String[] args){
    Thread thread1 = new Thread(new MyRunnable(1));
    Thread thread2 = new Thread(new MyRunnable(2));

    thread1.start();
    thread2.start();
    }
}
