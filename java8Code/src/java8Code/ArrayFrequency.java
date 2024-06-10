package java8Code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayFrequency {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 2, 34, 5, 5, 6, 7, 8, 8);
		Set<Integer> duplicates = findDuplicates(list);
		System.out.println("Duplicates: " + duplicates);
	}

	public static Set<Integer> findDuplicates(List<Integer> list) {
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (Integer number : list) {
			if (!seen.add(number)) {
				duplicates.add(number);
			}
		}

		return duplicates;
	}

}
