package Opdracht7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App1 {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
	      List<Person> persons1 = new ArrayList<>();

	      Person person1 = new Person("Homer", "Simpson",

	         GenderType.MALE, 43, 110, 175);

	      Person person2 = new Person("Marge", "Simpson",

	         GenderType.FEMALE, 38, 65, 170);

	      Person person3 = new Person("Bart", "Simpson",

	         GenderType.MALE, 10, 30, 102);

	      Person person4 = new Person("Lisa", "Simpson",

	         GenderType.FEMALE, 8, 25, 95);

	      Person person5 = new Person("Maggy", "Simpson",

	         GenderType.FEMALE, 3, 15, 65);

	      Person person6 = new Person("Maggy", "Simpson",

	         GenderType.FEMALE, 3, 15, 65);

	      persons1.add(person1);

	      persons1.add(person2);

	      persons1.add(person3);

	      persons1.add(person4);

	      persons1.add(person5);

	      persons1.add(person6);
 List<Person> list = persons1.stream().filter(p -> p.getGender() == GenderType.FEMALE).filter(p -> p.getAge() > 20).sorted(Comparator.comparingInt(Person::getAge)).
		 collect(Collectors.toList());    
 list.forEach(System.out::println);

	}

}
