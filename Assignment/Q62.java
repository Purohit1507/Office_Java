package Assignment3;
// Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Q62 {
	
	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		
		al.add(1);
		al.add("parth");
		al.add(true);
		al.add(123456);
		al.add(14.5);
		
		System.out.println(al);
		
//		Iterator ir =al.iterator();
//		
//		while (ir.hasNext())
//		{
//			System.out.println(ir.next());
//		}
		ListIterator litr=al.listIterator();
		   
	    while(litr.hasNext())
	{
			System.out.println(litr.next());
		}
		
		System.out.println("\n\nIterating through List Iterator -Bottom to Top");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		}

        

	}