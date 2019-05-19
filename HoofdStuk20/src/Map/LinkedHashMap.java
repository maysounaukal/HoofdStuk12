package Map;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap implements Map<Integer, String> {

	public static void main(String[] args) {
	Map<Integer,String> hm = new LinkedHashMap();
	hm.put(3, "Ihab");
	hm.put(4, "Salam");
	hm.put(2, "Maha");
	hm.put(32,"Feras");
	hm.put(33, "Ihab");
	
	
	for(Entry<Integer,String> intery: hm.entrySet()) {
		System.out.println(intery.getKey() + "   " + intery.getValue());
	}
		

		  
		  
		

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Entry<Integer, String>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Overr

}
