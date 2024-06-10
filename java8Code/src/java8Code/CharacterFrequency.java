package java8Code;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		String str = "nishasingh";
		
		Map<Character, Long> map=  str.chars().mapToObj(n -> (char) n).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(map);
		
	}
}
