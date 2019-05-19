package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Opdracht6 {

	public static void main(String[] args) {
		Deque<String> rij = new ArrayDeque<>();
		
		rij.offerFirst("Ali");
		rij.offerFirst("Irik");
		rij.offerFirst("Ilias");
		rij.offerLast("Mary");
		rij.offerLast("sara");
		rij.offerLast("Ann");
		
		String persons = rij.pollFirst();
	/*while(persons != null) {
		System.out.println(persons);
		persons = rij.pollFirst();*/
			
			  while(rij.size()>=2) {
				  //

			         System.out.printf("%s + %s%n", rij.pollFirst() , rij.pollLast());

			      }

			      if(rij.size() == 1) {

			         System.out.printf("Left over: %s%n", rij.pollFirst());
		}

	}

}
