package ThreadPractice;

public class RunnableMain {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable(10);

        myRunnable.run();
    }
}
