package StreamPractice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.w3c.dom.ls.LSOutput;

public class StreamPractice {
	public static void main(String[] args){
		List<Integer> numbers = Arrays.asList(1,2,3);
		Stream<Integer> stream = numbers.stream();
    System.out.println(stream.filter(n -> n % 2 == 0).count());

	int[] array = {1,2,3};
		IntStream intStream = Arrays.stream(array);
    System.out.println(intStream.filter(n -> n % 1 ==0).count());
	}


}
