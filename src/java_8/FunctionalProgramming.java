package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* for Predicates see mainPackage/FilesRead
 * 
 */

public class FunctionalProgramming {

	public static void main(String[] args) {

		List<Integer> mine = Arrays.asList(1, 2, 3, 8, 7, 2, 3, 1, 2, 2, 2, 2, 2, 2, 5, 5, 5, 5, 3, 4, 4, 2, 4);

		Optional<Integer> ans = mine.stream().filter(x -> x < 6).map(x -> x * 2).reduce((a, b) -> a + b);


		Runnable runnable = new Runnable() {

			@Override
			public void run() {

			}
		};

		Runnable runnable2 = () -> {
			System.out.println("xcvvvv");
		};

		for (int i = 1; i < 100; i++) {
			System.out.println(i);
		}

		IntStream.range(1, 100).forEach(i -> System.out.println(i));

		Long longVar = 10900000l;
		int x = longVar.intValue();
		Integer z = 90;
		Double u = 89.98987877;
		Long c = u.longValue();
		long y = z.longValue(); // convert Integer to Long

		int xx = 10;
		long yy = xx;

		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

		// Creating a list of Odd Numbers
		List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

		// Creating a list of Even Numbers
		List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

		List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

		System.out.println("The Structure before flattening is : " + listOfListofInts);

		// Using flatMap for transformating and flattening.
		List<Integer> listofInts = listOfListofInts.stream().flatMap(list -> list.stream())
				.collect(Collectors.toList());

	}

}
