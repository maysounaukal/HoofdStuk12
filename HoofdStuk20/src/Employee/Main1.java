package Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		List<Emplyee> employees = new ArrayList<>();
		employees.add(new Emplyee("MAYSOUN",1411,1000,LocalDate.of(1992, 11, 14)));
		employees.add(new Emplyee("Maha",2506,900,LocalDate.of(1998, 6, 25)));
		employees.add(new Emplyee("Mohammed",1109,1200,LocalDate.of(1994, 9, 11)));
		employees.add(new Emplyee("Diya",1807,1600,LocalDate.of(2005, 7, 18)));
		employees.add(new Emplyee("Ihab",2803,2000,LocalDate.of(1986, 3, 27)));
		
		Comparator<Emplyee> employeeName = new Comparator<Emplyee>() {

		@Override
		public int compare(Emplyee arg0, Emplyee arg1) {
				
		return arg0.getName().compareTo(arg1.getName());}};
		 // (arg0,arg1) -> arg0.getName().compareTo(arg1.getName());
		//employeeName = Comparator.comparing(Emplyee::getName);
		
   Collections.sort(employees, employeeName);
		

for(Emplyee em : employees) {
			System.out.println(em.getName() + "  " + em.getId() + "  " + em.getSalary() + "  " + em.getJoininDate());
		}
System.out.println("Salary");

/*Comparator<Emplyee> employeeSalary = new Comparator<Emplyee>() {

	@Override
	public int compare(Emplyee o1, Emplyee o2) {
		
	if(o1.getSalary() < o2.getSalary()) return -1;
	if(o1.getSalary() > o2.getSalary()) return 1;
	else return 0;
	}
	};
	Collections.sort(employees, employeeSalary);*/
// we kunnen disgn factor hier gebruiken 
Collections.sort(employees, Comparator.comparing(Emplyee::getSalary));
	
	for(Emplyee em: employees) {
		System.out.println(em.getName() + "  " + em.getSalary() + "  " + em.getId() + "  " + em.getJoininDate());
	}
	
	System.out.println("Identiteitkaart");

	/*Comparator<Emplyee> employeeId = new Comparator<Emplyee>() {

		@Override
		public int compare(Emplyee o1, Emplyee o2) {
			if(o1.getId() < o2.getId()) return -1;
			if(o1.getId() > o2.getId()) return 1;
			else return 0;
		}
	};
	
	Collections.sort(employees,employeeId);*/
	//by disgn factor 
	Collections.sort(employees, Comparator.comparing(Emplyee::getId));
	for(Emplyee e : employees) {
		System.out.println(e.getName() + "   " + e.getId() + "  " + e.getSalary() + "   " + e.getJoininDate());
	}
	

	

		
		

	}

}
