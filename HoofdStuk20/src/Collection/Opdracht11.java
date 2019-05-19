package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opdracht11 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	List<String> list = new ArrayList<>();


	System.out.println("Geef een zin in die is afgesloten met een punt");
	String text = null;//in while ...do moeten wij dat gebruiken
    
	do {
		text = input.next();
		list.add(text);
	}while(!text.endsWith("."));//als de zin niet is beeindigd met punt, voer waarin tussen de accolades van do
	
	System.out.println(list);

	input.close();
	
	//Druk de zin in omgekeerde volgorde af
	
	for(int i = list.size(); i > 0 ; i--) {
		System.out.println(list.get(i - 1));
	}
	
	// Druk het aantal woorden van de zin af
	
	System.out.println("het aantal worden:" + list.size());
	
	// Zet de verzameling van woorden om in een reeks van Strings en druk deze reeks af met behulp van een foreach-lus
	String[] message = list.toArray(new String[list.size()]);
	for(String el: message) {
		System.out.println(el);
	}

}}
