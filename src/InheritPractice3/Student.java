package InheritPractice3;

public class Student extends Person{
    int studentNum;

    public Student(String firstName, String lastName, int studentNum) {
        super(firstName, lastName);
        this.studentNum = studentNum;
    }
}
