package Assignment2;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to sort a given array list.
public class Q54 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
	    al.add(1);
	    al.add(6);
	    al.add(3);
	    al.add(2);
	    al.add(5);
	    al.add(4);
	   
	  System.out.println(al);
	  Collections.sort(al);
	  
	  System.out.println(al);
	
	
}
}