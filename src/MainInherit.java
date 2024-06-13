public class MainInherit {
    public static void main(String[] args){
        InheritB inheritB = new InheritB();

        inheritB.field2= "필드2";
        inheritB.method2();

        inheritB.field1 = 100;
        inheritB.method1();
    }
}
