package Assignment2;

import java.util.ArrayList;

// Write a Java program to search an element in an array list.
public class Q53 {
	
	public static void main(String[] args) {
			
				ArrayList al=new ArrayList();
			    al.add(1);
			    al.add("parth");
			    al.add('d');
			    al.add(true);
			    al.add(10.19f);
			    al.add(1000025589555555225l);
			   
			  System.out.println(al);
			  int elementtosearch =3;
			  int index =al.indexOf(1);
			  
			  if(index !=-1) {
				  System.out.println(elementtosearch +"found" +al);
				 
			  }else {
				  System.out.println(elementtosearch + "not found" +al);
			  }

}
	}
