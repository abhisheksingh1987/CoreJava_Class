package java8Code;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayFrequency {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,2,34,5,5,6,7,8,8);
		
		List<>list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting));
		
	}
}
