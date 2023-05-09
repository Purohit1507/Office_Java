package Assignment2;

import java.util.HashSet;

// Write a Java program to get the number of elements in a hash set.
public class Q59 {
	
	public static void main(String[] args) {
		
	
	HashSet hs=new HashSet();
	hs.add(123456);
	hs.add(22.22);
	hs.add('c');
	hs.add("parth");  
	
	
	System.out.println(hs);
	System.out.println(hs.size());
}
}