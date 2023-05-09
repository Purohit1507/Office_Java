package Assignment2;

import java.util.HashSet;
import java.util.Iterator;

// Write a Java program to iterate through all elements in a hash list
public class Q58 {

public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(123456);
		hs.add(22.22);
		hs.add('c');
		hs.add("parth");  
		
		
		System.out.println(hs);
		
		Iterator ir=hs.iterator();
		while(ir.hasNext() )
		{
			System.out.println(ir.next());
		}
		
		
		
	}
}
