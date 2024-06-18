package GenericInherit;

public class Product<T, M> { // 타입 파라미터: 2개
  private T kind;
  private M model;

  // getter
  public T getKind() {
    return kind;
  }

  public M getModel() {
    return model;
  }

  // setter
  public void setKind(T kind) {
    this.kind = kind;
  }

  public void setModel(M model) {
    this.model = model;
  }
}
