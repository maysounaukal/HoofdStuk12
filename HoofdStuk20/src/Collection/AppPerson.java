package Collection;

import java.util.HashSet;
import java.util.Set;

public class AppPerson {

	public static void main(String[] args) {

   Set<Opdracht2Person> list = new HashSet<>();//we zien dat de generieke klasse is Opdracht2Person
   Opdracht2Person person1 = new Opdracht2Person("Firas","Aukal",GenderType.MAN,24,61,167); 
   Opdracht2Person person2 = new Opdracht2Person("Ihab" ,"Aukal",GenderType.WOMEN,32,77,172);
   Opdracht2Person person3 = new Opdracht2Person("Maggy", "Simpson", GenderType.WOMEN,3, 15,65);
    Opdracht2Person person6 = new Opdracht2Person("Maggy", "Simpson", GenderType.WOMEN,3, 15,65);
   list.add(person1);
   list.add(person2);
   list.add(person3);
   list.add(person6);
   for(Opdracht2Person p: list) {
	   System.out.println(p);
   }
   //als wij hashcode en equals gebruiken de uitput zal zoals onderaan zijn
   //in de output hebben we gezien dat de herhaalde objecten wordt niet afgedrukt, en wordt georderd door alfabet
   //maar als we hashcode en equals niet gebruiken,de objecten duplicaten en de eerste en de laatste plaats staan 
 //en de elementen worden niet georderd
   
   
   //hashcode en equals gebruiken om te ordenen en niet herhalen
	}

}
