package Collection;

import java.util.HashSet;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.Set;

public class Opdracht2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef een aantal numbers in");
	Set<Integer> numbers = new HashSet<>();
	int number = 0;
	while((number = input.nextInt()) != 0) {
		numbers.add(number);
	}
	//int sum = numbers.stream().mapToInt(Integer::valueOf).sum();
	//OptionalDouble average = numbers.stream().mapToInt(Integer::valueOf).average();
	//if(average.isPresent()) {
		//System.out.println(average.getAsDouble());
	//}else {
	//	System.out.println("Invalid");
	//}
	int sum = 0;
	for(int s : numbers) {
		System.out.println(s);
		sum += s;
	}
	System.out.println("de som :" + sum);
	
	System.out.println("de average" + sum/ numbers.size());
	
	Integer[] arr = numbers.toArray(new Integer[numbers.size()]);
	for(int in: arr) {
		System.out.println(in);
	}
	//hashset
	//we zijn in de output dart er geen duplicatie is en de elementen wordt georderd van klein tot groot
	

	}

}
