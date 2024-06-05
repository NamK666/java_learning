import java.util.Scanner;

public class day5 {
  public static void main(String[] args) {
    String[] words = {"apple", "banana", "cherry", "durian"};

    // for 문 활용 **//
    for (int i = 0; i < words.length - 1; i++) { // 부모는 cherry까지만 가야함.
      for (int j = i + 1; j < words.length; j++) {
        System.out.println(words[i] + " " + words[j]);
      }
    }
    // For each 활용 //
    int index = 0;
    for (String word : words) {
      for (int i = index + 1; i < word.length(); i++) {
        String word2 = words[i];
        System.out.println(word + " " + word2);
      }
      index++;
    }
  }
}
