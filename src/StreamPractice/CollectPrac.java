package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectPrac {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3);

    List<Integer> sqauredNumbers = list.stream().map(num -> num * num).collect(Collectors.toList());
  }
}
