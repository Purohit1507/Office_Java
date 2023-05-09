package Assignment2;

import java.util.ArrayList;

//Write a Java program to remove the third element from an array list. 

public class Q52 {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
	    al.add(1);
	    al.add("parth");
	    al.add('d');
	    al.add(true);
	    al.add(10.19f);
	    al.add(1000025589555555225l);
	   
	  System.out.println(al);
	    System.out.println(al.remove(3));
	    System.out.println(al);

}
}