package Lamda;

public class LambdaThreadEx {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("스레드1 running..");
            }
        });
    }
}
