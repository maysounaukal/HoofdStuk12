package Map;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"AB");
		map.put(2,"BC");
		map.put(7, "CD");
		map.put(3, "DE");
		
		System.out.println(map);
		
		System.out.println(map.get(7));
		
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println("key:" + m.getKey() + "  " + "value:" + m.getValue());
		}
		
		
		for(Integer i: map.keySet()) {
			System.out.println(i + ":" + map.get(i));
		}
		
		map.clear();
		
		System.out.println(map);

	}

}
