package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,4,5);



	        //double the even values and put that into a list



	        //Wrong way to do this

	        List<Integer> doubleOfEven = new ArrayList<>();



	        numbers.stream()

	                .filter(e-> e % 2 == 0)

	                .map(e -> e * 2)

	                .forEach(e -> doubleOfEven.add(e)); //Dont do this

	        //mutability is OK, sharing is nice, shared mutability is devils work

	        //because troubles in parallel processing

	        //friends don't let friends do shared mutation

	        System.out.println(doubleOfEven);



	        // use collect(Collectors...  is the safe way

	        List<Integer> doubleOfEven2 =

	                numbers.stream()

	                .filter( e -> e % 2 == 0)

	                .map( e -> e * 2)

	               .collect(Collectors.toList());
	              

	        System.out.println(doubleOfEven2);



	        Set<Integer> setDoubleOfEven =

	                numbers.stream()

	                .filter(e -> e % 2 == 0)

	                .map( e -> e * 2)

	                .collect(Collectors.toSet());

	        System.out.println(setDoubleOfEven);
	        
	        System.out.println();
	        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,1,2,3,4,5);



	        numbers1.stream()

	                .filter( e -> e % 2 == 0)

	              .forEach(System.out::println);
	              

	        //sized, ordered,  non-disctinct,  non-sorted

System.out.println();

	        numbers1.stream()

	                .filter( e -> e % 2 == 0)

	                .sorted()

	                .distinct()

	                .forEach(System.out::print);
	}

}
