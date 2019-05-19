package Collection;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Opdracht44 {

	public static void main(String[] args) {
		NavigableSet<String> list = new TreeSet<>(Comparator.comparing(String::length));
	//zonder dat wij (Comparator.comparing(String::length)) gebruiken,de woorden worden georderd door alfabet
		//omdat TreeSet implementeert Set en het is een geordende en gesorteerde verzameling(niet herhalen ,en
		//ordenen)
		
		//maar als wij(Comparator.comparing(String::length)) gebruiken , de woorden worden georderd door de lengte
		//van elk woord
		list.add("Hello");
		list.add("this");
		list.add("is");
		list.add("an");
		list.add("example");
		
		for(String s:list) {
			System.out.println(s);
		}
	//hier worden de woorden vergeleken met elkaar..het aantal letters in elke woord word georderd
		//en we zien ook dat het woord(is) bevat 2 letters en het woord("an") bevat 2 letters
		//maar de eerste woord is afgedrukt en de andere niet, omdat zij zeijn gelijk aan elkaar in
		//het aantal letters
		
		System.out.println("de eerst woord:" + " " + list.first());//de first woord in de console
		System.out.println("de laatste woord:" + " " + list.last());//de laatste woord in de console
		System.out.println("het element dat groter of gelijk is aan het opgegeven element:" + 
		"  " + list.ceiling("Hello"));
		System.out.println("het element dat kleiner of gelijk is aan het opgegeven element:" +
		"  " + list.floor("this"));
		System.out.println("het volgende element dat hoger is dan het opgegeven element:" +
		"  " + list.higher("Hello"));//de element(enkel een) die meer dan dit letters heeft
		System.out.println("het volgende element dat lager is dan het opgegeven element:" +
		"  " + list.lower("Hello"));// de element(enkel een) die minder dan dit letters heeft

	}

}
