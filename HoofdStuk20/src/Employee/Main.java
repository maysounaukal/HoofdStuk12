package Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Emplyee> em = new ArrayList<>();
		em.add(new Emplyee("MAYSOUN",1411,1000,LocalDate.of(1992, 11, 14)));
		em.add(new Emplyee("Maha",2506,900,LocalDate.of(1998, 6, 25)));
		em.add(new Emplyee("Mohammed",1109,1200,LocalDate.of(1994, 9, 11)));
		em.add(new Emplyee("Diya",1807,1600,LocalDate.of(2005, 7, 18)));
		em.add(new Emplyee("Ihab",2803,2000,LocalDate.of(1986, 3, 27)));
		
		Collections.sort(em);
		
		for(Emplyee m: em) {
			System.out.println(m.getName() + "   " + m.getId() + "   " + m.getSalary() +"  " + m.getJoininDate());
		}

	}

}
