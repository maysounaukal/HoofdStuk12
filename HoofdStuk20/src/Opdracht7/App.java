package Opdracht7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
	      List<Person> persons = new ArrayList<>();

	      Person person1 = new Person("Homer", "pimpson",

	         GenderType.MALE, 43, 110, 175);

	      Person person2 = new Person("Marge", "Simpson",

	         GenderType.FEMALE, 38, 65, 170);

	      Person person3 = new Person("Bart", "rimpson",

	         GenderType.MALE, 10, 30, 102);

	      Person person4 = new Person("Lisa", "aimpson",

	         GenderType.FEMALE, 8, 25, 95);

	      Person person5 = new Person("Maggy", "cimpson",

	         GenderType.FEMALE, 3, 15, 65);

	      Person person6 = new Person("Maggy", "dimpson",

	         GenderType.FEMALE, 3, 15, 15);

	      persons.add(person1);

	      persons.add(person2);

	      persons.add(person3);

	      persons.add(person4);

	      persons.add(person5);

	      persons.add(person6);

	      System.out.println("Natural order:");

	      persons.sort(Comparator.naturalOrder());// om de height te ordenen op basis van de methode compare in 
	      //person klasse
	      persons.forEach(System.out::println);
	      
	      System.out.println("het gewicht");
	      
	      persons.sort(Comparator.comparingDouble(Person::getWeight));
	      persons.forEach(System.out::println);
	      
	      System.out.println("het laatste naam");
	      persons.sort(Comparator.comparing(Person::getLastName));
	      persons.forEach(System.out::println);
	      
	      System.out.println("de voornaam");
	      persons.sort(Comparator.comparing(Person::getFirstName));
	      persons.forEach(System.out::println);
	      

	}

}
