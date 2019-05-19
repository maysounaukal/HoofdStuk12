package Employee;

import java.time.LocalDate;

public class Emplyee implements Comparable<Emplyee>{
private int id;
private String name;
private double salary;
private LocalDate joininDate;


public Emplyee(String string, double i, int j, LocalDate of) {
	this.name = string;
	this.salary = i;
	this.id = j;
	this.joininDate = of;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}


public LocalDate getJoininDate() {
	return joininDate;
}


public void setJoininDate(LocalDate joininDate) {
	this.joininDate = joininDate;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((joininDate == null) ? 0 : joininDate.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(salary);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Emplyee other = (Emplyee) obj;
	if (id != other.id)
		return false;
	if (joininDate == null) {
		if (other.joininDate != null)
			return false;
	} else if (!joininDate.equals(other.joininDate))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
		return false;
	return true;
}


@Override
public int compareTo(Emplyee o) {
	if(this.id < o.id) return -1;
	if(this.id > o.id)  return 1;
   else  return 0;
	
}


@Override
public String toString() {
	return "Emplyee (id=" + id + ", name=" + name + ", salary=" + salary + ", joininDate=" + joininDate + ")";
}

}
