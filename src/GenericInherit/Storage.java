package GenericInherit;

public interface Storage<T> { // 타입파라미터: 1개
    void add(T item, int index);

    T get(int index);
}
