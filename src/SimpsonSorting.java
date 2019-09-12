import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Simpson implements Comparable<Simpson> {
    String name;

    Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }
}

public class SimpsonSorting {
	public static void main(String... sortingWithList) {
        List<String> simpsons = new ArrayList<>();
        simpsons.add(new String("Homer "));
        simpsons.add(new String("Marge "));
        simpsons.add(new String("Bart "));
        simpsons.add(new String("Lisa "));

        Collections.sort(simpsons);
        
        simpsons.stream().forEach(System.out::print);
        
       // simpsons.stream().map(s -> s.name).forEach(System.out::print);

        Collections.reverse(simpsons);
        simpsons.stream().forEach(System.out::print);
    }
}
