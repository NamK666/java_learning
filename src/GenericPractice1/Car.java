package GenericPractice1;

public class Car<T> {
    private T model;

    public Car() {}

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}
