package GenericPractice3;

public class Car<T> {
  private T model;

  public Car() {}

  public void setModel(T model) {
    this.model = model;
  }

  public T getModel() {
    return model;
  }
}
