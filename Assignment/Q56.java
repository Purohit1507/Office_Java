package Assignment2;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to shuffle elements in an array list. 
public class Q56 {
public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
	    al.add(1);
	    al.add(6);
	    al.add(3);
	    al.add(2);
	    al.add(5);
	    al.add(4);
	   

	    System.out.println(al);
	    
	    Collections.shuffle(al);
	    System.out.println("shuffled " +al); // Result will be different every time 
	
	

}
}