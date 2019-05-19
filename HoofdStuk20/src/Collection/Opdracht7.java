package Collection;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Opdracht7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Set<Integer> numbers = new TreeSet<>();
		Set<Integer>  getallen = new TreeSet<>();
	     Random rand = new Random();
	     
	     do {
	    	  numbers.add(rand.nextInt(45) + 1);
	    	 
	     }while(numbers.size() != 6);
	     
	     do {  System.out.println("Voeg een nummer in");
    	       int s = input.nextInt();
    	       System.out.println(s);
    	       if(s < 1 || s > 45) {
    	    	   System.out.println("Invalid");
    	       }else if(!getallen.add(s)) {
    	    	   System.out.println("duplicaat");
    	       }
    	       
	     }while(getallen.size() != 6);
	     System.out.println("numbers");
	     numbers.forEach(System.out::println);
	     
	     System.out.println("getallen");
	     getallen.forEach(System.out::println);
	     
	     numbers.retainAll(getallen);
	     System.out.println(" het aantal nummers" + numbers.size());
	     
	     numbers.forEach(System.out::println);
	}

}
