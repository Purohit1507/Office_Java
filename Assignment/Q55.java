package Assignment2;

import java.util.ArrayList;

// Write a Java program to copy one array list into another.
public class Q55 {
public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
	    al.add(1);
	    al.add(6);
	    al.add(3);
	    al.add(2);
	    al.add(5);
	    al.add(4);
	   

	    System.out.println(al);
	    
	    ArrayList al2=new ArrayList();
	    al2.addAll(al);
	    
	    System.out.println("source array list" +al);
	    System.out.println("new array list" +al2);
	    
	    
}
}
