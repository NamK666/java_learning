package GenericInherit2;

public class ChildProduct<K, M, C> extends Product<K, M> {
  private C company;

  public C getCompany() {
    return company;
  }

  public void setCompany(C company) {
    this.company = company;
  }
}
