package collection;

/*
 * HashMap : it internally implements Map interface, and extends abstract class Map
 * 		
 * 			- HashMap works with Key and Value Pair
 * 			- Every Key will be unique.
 * 			- No Duplicate Keys are allowed.
 * 
 * 
 */

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmap_demo {
	
	public static void main(String[] args) {
		
		
		LinkedHashMap hm=new LinkedHashMap<>();
		hm.put("india", 123456);
		hm.put("Shrianka", 789456);
		hm.put("china", 456789);
		hm.put(1, "Ramesh");
		hm.put(2, "Suresh");
		hm.put(3, "Mangesh");
		hm.put(4, "Rajesh");
		hm.put(5, "Haresh");
		hm.put(6, "Lokesh");
		hm.put(4, "Suyesh");
		
		
		System.out.println(hm);
		System.out.println(hm.get(5));
		System.out.println(hm.get("india"));
		hm.remove("china");
		System.out.println(hm);

	
	}

}
