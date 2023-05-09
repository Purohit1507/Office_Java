package Assignment2;

import java.util.ArrayList;
import java.util.Iterator;

// Write a Java program to iterate through all elements in an array list. 
public class Q48 {
	
	public static void main(String[] args) {
		
	
	ArrayList al=new ArrayList();
	
	al.add(1);
	al.add("parth");
	al.add(true);
	al.add(123456);
	al.add(14.5);
	
	System.out.println(al);
	
	Iterator ir =al.iterator();
	
	while (ir.hasNext())
	{
		System.out.println(ir.next());
	}
	
	    
}
}