package LastInFirstOut;

import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    Stack<Coin> coinStack = new Stack<>();

    coinStack.push(new Coin(500));
    coinStack.push(new Coin(100));
    coinStack.push(new Coin(50));
    coinStack.push(new Coin(10));

    while (!coinStack.isEmpty()) {
      Coin coinPop = coinStack.pop();
      System.out.println("꺼내온 동전: " + coinPop.getValue() + "원");
    }
  }
}
