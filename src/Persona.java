public class Persona {
    String name;
    String ssn;

    // 생성자
    public Persona(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public void say(){
    System.out.println("my name is " + this.name);
    }
}
