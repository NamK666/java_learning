package Persona;

public class Student extends Person{
    int studentNum;

    public Student(String name, String gender, int studentNum) {
        super(name, gender);
        this.studentNum = studentNum;
    }
}
