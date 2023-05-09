package Assignment3;

import java.util.ArrayList;

// Write a Java program to compare two array lists.
public class Q64 {
	public static void main(String[] args) {
		
	
	ArrayList al=new ArrayList();
	
	al.add(1);
	al.add("parth");
	al.add(true);
	al.add(123456);
	al.add(14.5);
	
	System.out.println(al);

	
ArrayList al2=new ArrayList();
	
	al2.add(1);
	al2.add("parth");
	al2.add(true);
	al2.add(123456);
	al2.add(14.5);
	
	System.out.println(al2);
	

	boolean are=al.equals(al2);
	if(are) {
		System.out.println("arraylist are equal");
	
	}else
	{
		System.out.println("arraylist are not equal");
	}
}
}