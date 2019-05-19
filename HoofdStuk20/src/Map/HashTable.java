package Map;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> m = new Hashtable<Integer,String>();
		
		m.put(1, "Bon Jovi"); 
		m.put(2, "Maroon 5"); 
		m.put(2, "Maroon 5"); 
		m.put(4, "Coldplay");
		
		for(Entry<Integer, String> s: m.entrySet()) {
			System.out.println(s.getKey() + "   " + s.getValue());
		}
		m.put(3, "Diya");
	//	m.put(1, null); false
		System.out.println(m);
		m.remove(2, "Maroon 5");
		
		System.out.println(m);
//In hashtable is er geen herheling voor elementen en accepteert niet de waarde die null heeft
	}

}
