package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* for Predicates see mainPackage/FilesRead
 * 
 */

public class FunctionalProgramming {

	public static void main(String[] args) {

		List<Integer> mine = Arrays.asList(1, 2, 3, 8, 7, 2, 3, 1, 2, 2, 2, 2, 2, 2, 5, 5, 5, 5, 3, 4, 4, 2, 4);

		List<Integer> res = mine.stream().
								filter(x -> x < 6)
								.map(x -> x * 2)
								.collect(Collectors.toList());

		for (Integer integer : res) {
			System.out.println(integer);
		}
		res.forEach(n -> System.out.println(n));
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
			}
		};
		
		Runnable runnable2 = () -> {
			System.out.println("xcvvvv");
		};
	
		for(int i=1;i<100;i++) {
			System.out.println(i);
		}
	
		IntStream.range(1, 100).forEach(i -> System.out.println(i));
	
		Long longVar = 10900000l;
		int x = longVar.intValue();
		Integer z = 90;
		Double u = 89.98987877;
		Long c = u.longValue();		
		long y = z.longValue();  //convert Integer to Long
	}

}
