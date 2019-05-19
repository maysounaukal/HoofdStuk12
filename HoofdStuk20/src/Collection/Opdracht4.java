package Collection;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Opdracht4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef een aantal woorden in");
		String text = null;
		NavigableSet<String> message = new TreeSet<>();
		while(!(text = input.next()).equals(".")){
		message.add(text);
		}
		
		for(String s: message) {
			System.out.println(s);
		}//hier worden de woorden georderd, en het hoofd letter is voor de klein letter(Good...abdulla)
		//als wij hoofdletter hebben en de rest is kleinletter ...dan het woord met hoofdletter voor zijn en
		//dan de kleindat zelfs wij (a) leteer hebben
		
		System.out.println("het alfabetische eerste woord" +"  " +  message.first());
		
		System.out.println("het alfabetische laatste woord" +"  "+ message.last());
		//het heeft niet de herhaalde woorden afgedrukt
		

	}

}
