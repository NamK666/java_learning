package Wildcard;

public class Course<T> {
  private String name;
  private T[] students; // 코스를 string으로 넣으면, 문자배열이 되는 것임.

  public Course(String name, int capacity) {
    this.name = name;
    students = (T[]) new Object[capacity];
    // 타입 파라미터로 배열을 생성하려면 newT[n] 형태로 배열을 생성할 수 없고
    // (T[]) new Object[n]) 으로 생성해야 한다.
  }

  public String getName() {
    return this.name;
  }

  public T[] getStudents() {
    return this.students;
  }

  public void add(T t) {
    for (int i = 0; i < students.length; i++) {
      if (students[i] == null) {
        students[i] = t;
        break;
      }
    }
  }
}
