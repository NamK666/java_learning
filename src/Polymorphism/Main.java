package Polymorphism;

public class Main {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // "멍멍"
        cat.makeSound(); // "냐옹"
    }
}
