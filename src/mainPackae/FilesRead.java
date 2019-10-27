package mainPackae;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilesRead {

	
	public static void main(String...args) throws IOException {
		
		List<String> words = Files.lines(Paths.get("Resources/MyFile.txt"))
		.map(s -> s.split(" "))
		.flatMap(Arrays::stream)
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		
		Predicate<String> pred = s -> s.startsWith("a");
		
		words
		.stream()
		.filter(pred)
		.forEach(s -> System.out.println(s));
	
	System.out.println(" -------------     ");
	
		Files.list(Paths.get(""))
		.filter(Files::isDirectory)
		.forEach(System.out::println);
	}
}
