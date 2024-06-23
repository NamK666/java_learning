package Thread1;

public class MainMT {
    public static void main(String[] args){
        MT mt1 = new MT("스레드1");
        MT mt2 = new MT("스레드2");
        MT mt3 = new MT("스레드3");

        mt1.run();
    }
}
