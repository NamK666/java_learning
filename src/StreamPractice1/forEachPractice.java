package StreamPractice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class forEachPractice {
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(1,2,3);
		list.forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Integer> squaredNumbers = numbers.stream().map(num -> num * num).collect(Collectors.toList());
	}
}
