package ThreadPractice;

public class ThreadPlay2 {
    public static void main(String[] args){

        MyThread2 myThread2 = new MyThread2("스레드1");
        MyThread2 myThread22 = new MyThread2("스레드2");
        MyThread2 myThread222 = new MyThread2("스레드3");

        myThread2.start();
        myThread22.start();
        myThread222.start();
    }
}
