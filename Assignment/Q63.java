package Assignment3;

import java.util.ArrayList;

// Write a Java program to extract a portion of an array list. 
public class Q63 {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		
		al.add(1);
		al.add("parth");
		al.add(true);
		al.add(123456);
		al.add(14.5);
		
		System.out.println(al);
		
	 
		ArrayList subArrayList = new ArrayList(al.subList(1, 4));  // Extracting index 1 and 4 from above array list
		
		System.out.println(subArrayList);
		
		
}
}