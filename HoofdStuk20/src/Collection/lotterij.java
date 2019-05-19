package Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class lotterij {

	public static void main(String[] args) {
		final int MAX = 45;
	    Set< Integer> loto = new HashSet<>();
	    Scanner input = new Scanner(System.in);
	    Random rand = new Random();
	    System.out.println("Geef zes verschillende lottogetallen in tussen 1 en" + MAX);
	    
	    do {
	    	loto.add(rand.nextInt(MAX) + 1);
	    }while(loto.size() != 6);
	    
	    

	}

}
