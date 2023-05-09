package Assignment2;

import java.util.HashSet;

// Write a Java program to append the specified element to the end of a hash set. 

public class Q57 {
	
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(123456);
		hs.add(22.22);
		hs.add('c');
		hs.add("parth");   // adding parth name at the end of a hash set
		
		System.out.println(hs);
	}

}
