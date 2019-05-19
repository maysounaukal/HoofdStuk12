package Opdracht5;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AppBurgerOrder {

	public static void main(String[] args) {
		Queue<BurgerOrder> magdonals = new LinkedList<>();
		//we zien als wij (LinkedList) gebruiken , de eerste object die we hebben toegevoegd, is de eerste die
		//is buitengegaag
		BurgerOrder burger1 = new BurgerOrder("Ali" , 7);
		BurgerOrder burger2 = new BurgerOrder("saar" , 3);
		BurgerOrder burger3 = new BurgerOrder("sara", 2);
		BurgerOrder burger4 = new BurgerOrder("rudi", 1);
		BurgerOrder burger5 = new BurgerOrder("Irik", 5);
		
		magdonals.offer(burger1);
		magdonals.offer(burger2);
		magdonals.offer(burger3);
		magdonals.offer(burger4);
		magdonals.offer(burger5);
		
		BurgerOrder burger = magdonals.peek();
		
		while( burger != null) {
			System.out.println("About to handle for" + " " + burger.getName());
			burger = magdonals.poll();
			System.out.println("Handling for"+ " " + burger.getName() + " " +"with number"+ "  " + burger.getNumber());
			burger = magdonals.peek();
		}
		
		
		
		
		
		

	}

}
