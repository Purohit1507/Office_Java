package Assignment2;

import java.util.HashMap;

//Write a Java program to associate the specified value with the specified key in a 
//Hash Map. 

public class Q60 {

	public static void main(String[] args) {
		
		
		HashMap hm=new HashMap();
		hm.put(1, "parth");
		hm.put(2, "bhavin");
		hm.put(3, "bhargav");
		
		System.out.println(hm);
		
		hm.put(4, "kalpesh");
		System.out.println(hm.get(1));
		System.out.println(hm);
	}
}
