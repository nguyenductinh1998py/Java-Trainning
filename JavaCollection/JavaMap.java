package JavaCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		System.out.println("--------------Add Element--------------");
		map.put(1, "Cat");
		map.put(2, "Chicken");
		map.put(3, "Bird");
		
		Set<Integer> keySet = map.keySet();
		
		for (Integer i: keySet) {
			System.out.println(i + " " + map.get(i));
		}
		
		System.out.println("--------------Delete Element--------------");
		map.remove(3);
		
		Set<Integer> keySet2 = map.keySet();
		
		for (Entry<Integer, String> s: map.entrySet()) {
			System.out.println(s.getKey() + " " + s.getValue());
		}
	}
}