package interview;


import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class JavaStreams {

	/*		JAVA 8 Stream API
	 * 
	 * 1: Basic:   stream , map, filter , forEach , collect , limit , count
	 * 
	 * 
	 * 2: Advance : hm.entrySet() , flatMap , Predicate , sorted , reduce , 
	 * 
	 * 3: Never Used: paralleStream , calling function using ForEach
	 */
	
	private static void flatMaps() {
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
  
        List<List<Integer>> listOfListofInts = 
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 
  
        System.out.println("The Structure before flattening is : " + 
                                                  listOfListofInts); 

        							listOfListofInts.stream() 
                                    .flatMap(list -> list.stream()) 
                                    .collect(Collectors.toList())
                                    .forEach(System.out::print);
  
	}
	
	
	private  void playWithStreams() {
		
		List<String> list = Arrays.asList("geeks", "GFG", "", "","","","","","", 
                "geeksforGeeks", "gfg"); 
		
		
		//Count Number of empty strings
		
	//	long count = list.parallelStream().filter(s -> s.isEmpty()).count();
		
		list.stream().filter(s -> s.length()>0).forEach(s -> firstCapitalise(s));
	}
	
	private void firstCapitalise(String s) {
		
		s = s.substring(0,1).toUpperCase() + s.substring(1);
		System.out.println(s);
	}
	
	
	public static void main(String...strings) throws NumberFormatException, IOException {
		
	//	flatMaps();
		JavaStreams java = new JavaStreams();
		java.playWithStreams();
		Map<String,String> hm = new HashMap<>();
		
		hm.put("1","one");
		hm.put("2","two");
		hm.put("3","one");
		hm.put("4","two");

		
		// Print Unique values of HashMap
	//	hm.entrySet().stream().map(s -> s.getValue()).collect(Collectors.toSet()).forEach(s ->
	//	System.out.println(s));
		  
		
		Predicate<String> pr = (p) -> p.length()<=5;
				
				
		List<String> list = Arrays.asList("Geeks", "GFG", 
                "GeeksforGeeks", "gfg"); 
		  
		// Predicate
		//list.stream().filter(pr).forEach(System.out::println);
		
		//Sorted & Map
		//list.stream().sorted().map(s -> s.charAt(2)).forEach(s -> System.out.println(s));
		
	}
}
