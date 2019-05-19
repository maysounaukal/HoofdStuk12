package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Opdracht22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("geef zinnen in");
		Set<String> message = new HashSet<>();
		
		String text = null;
		
		do {
			text= input.next();
			message.add(text);
			
		}while(!text.endsWith("."));
		
		for(String w: message) {
			System.out.println(w);
		}
		System.out.println("het aantal woorden:" + message.size());
		
		String[] arr = message.toArray(new String[0]);
		
		for(String m : message) {
			System.out.println(m);
		}
		input.close();
		//HashSet
		//we zijn dat het woord (good) niet wordt herhaald en worddt georderd door alfabet

	}

}
