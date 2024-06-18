package InheritPractice5;

public class Dog extends Animal {
    int age;

    void sleep(int times){
    System.out.println(name + " zzzz..." + times + "hours");
    }

    public Dog(int age){
        super("okay","남");
        this.age = age;
    }
}
