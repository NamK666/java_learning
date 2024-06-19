package keySetMethodPractice;

import java.util.*;

public class Test {
   public static void main(String[] args){
       Map<String, Integer> map = new HashMap<>();
       Set<String> keySet = map.keySet();
       Iterator<String> iterator = keySet.iterator();

       while(iterator.hasNext()){
           String key = iterator.next();
           Integer value = map.get(key);
       }
   }
}
