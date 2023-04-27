package collection;

import java.util.Stack;

/*
 * Stack : it follows LIFO (Last in First Out) order.
 * 			
 * 			e.g Plates arrangement.
 * 		 
 * 
 * 
 * 
 */

public class Stack_Demo {

	public static void main(String[] args) {
		
		Stack sf=new Stack();
		sf.push(123);
		sf.push("parth");
		sf.push(10.987f);
		sf.push(10000000000000l);
		
		
		System.out.println(sf);
		
		sf.pop();
		System.out.println(sf);
	}
}
