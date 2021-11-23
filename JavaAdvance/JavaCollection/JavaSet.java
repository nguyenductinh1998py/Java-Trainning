package JavaCollection;

import java.util.HashSet;
import java.util.Set;

public class JavaSet {
	public static void main(String[] args) {
		Set<String> setString = new HashSet<String>();
		
		System.out.println("-----------Add Element------------");
		
		setString.add("D");
		setString.add("C");
		setString.add("G");
		setString.add("H");
		setString.add("W");
		setString.add("A");
		
		for (String s: setString) {
			System.out.println(s);
		}
		
		System.out.println("-----------Delete Element------------");
		
		setString.remove("H");
		for (String s: setString) {
			System.out.println(s);
		}
	}
}