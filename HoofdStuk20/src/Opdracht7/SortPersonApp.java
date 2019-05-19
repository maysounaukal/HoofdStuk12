package Opdracht7;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortPersonApp {

	public static void main(String[] args) {
		//Set<Person> persons = new TreeSet<Person>();//(natuurlijke volgorde) om de height te ordenen met comparable
		//Set<Person> persons = new TreeSet<Person>(new AgaComparator());
		//comparator om de leeftijden te ordenen
		/*Set<Person> persons = new TreeSet<Person>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getAge() - o2.getAge();
			}
			
		});//andere manier om de leeftijden te ordenen*/
		
	/*	Set<Person> persons = new TreeSet<>(Comparator.comparingInt((Person p) -> p.getAge()).thenComparing(p -> p.getLastName()).
				thenComparing(p -> p.getWeight()));
		//om de leeftijden,achternaam en gewicht te ordenen */
		
		Set<Person> persons = new TreeSet<>(Comparator.comparingInt(Person::getAge).thenComparing(Person:: getLastName).
				thenComparing(Person::getWeight));//op andere manier
		
	      Person person1 = new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175);

	      Person person2 = new Person("Marge", "bimpson", GenderType.FEMALE,38,65, 170);

	      Person person3 = new Person("Bart", "nimpson", GenderType.MALE,10, 30,102);

	      Person person4 = new Person("Lisa", "pimpson", GenderType.FEMALE,8, 25,95);

	      Person person5 = new Person("Maggy", "limpson", GenderType.FEMALE,3, 15,65);

	      Person person6 = new Person("Maggy", "aimpson", GenderType.FEMALE,3, 15,65);

	      persons.add(person1);

	      persons.add(person2);

	      persons.add(person3);

	      persons.add(person4);

	      persons.add(person5);

	      persons.add(person6);
	      
	      System.out.println(persons);
	      
	      

	}

}
