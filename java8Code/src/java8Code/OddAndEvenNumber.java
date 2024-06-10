package java8Code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEvenNumber {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,2,1,3,5,6,7,8,9);
		
		List<Integer> seprateEvenOdd =list.stream().filter(n -> n %2 == 0).collect(Collectors.toList());
		
		System.out.println(seprateEvenOdd);
	} 

}
