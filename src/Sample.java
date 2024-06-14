public class Sample {

    public static void main(String[] args){
        Zookeeper zookeeper = new Zookeeper();

        Tiger tiger = new Tiger();
        zookeeper.feed(tiger);

        Lion lion = new Lion();
        zookeeper.feed(lion);
    }
}
