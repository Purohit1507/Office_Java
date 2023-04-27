package collection;



/*Collections : it is a group of data.
* 
* 				- One Object can contain more than one Object.
* 
* - In c/c++ we have Structure, where it stores multiple elements of multiple types.
* - In Java we have Collections.
* 
*  
* ArrayList : 
* 
* 	- ArrayList is a class, which internally implements the List interface. 
* 
*  - it is similar like an Array, because the index starts from 0.
*  - Like Array , it stores the multiple values but of same type.
*  - But ArrayList stores the multiple values of Multiple types.
*  
*  - it stores the data in Sequential Manner.
*  - Duplicate values are allowed.
*  - ArrayList is Dynamic, whereas Array is Static.
* 
* Iterator :
* 
* - Iterator is an interface, which is used to iterate each element at a time.
* - it follows Top-Bottom Approach.
* 
* ListIterator :
* 
* - it is an inteface , which is used to iterate each elements, but here it 
*   follows Top-Bottom and Bottom-Top Approach.
* 
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_demo {
	
	public static void main(String[] args) {
		
	
	ArrayList al=new ArrayList();
    al.add(1);
    al.add("parth");
    al.add('d');
    al.add(true);
    al.add(10.19f);
    al.add(1000025589555555225l);
    
  
    
    
    System.out.println(al);
    System.out.println(al.indexOf("parth"));
    System.out.println(al.size());
    System.out.println(al.lastIndexOf(true));
    System.out.println(al.isEmpty());
    System.out.println(al.remove(2));
    System.out.println(al);
    
    
    
    
   Iterator itr=al.iterator();
    
   while(itr.hasNext())
   {
   	System.out.println(itr.next());
   }
   System.out.println("dsds");
    
   ListIterator litr=al.listIterator();
    
	
    while(litr.hasNext())
{
		System.out.println(litr.next()+"tops");
	}
	
	System.out.println("\n\nIterating through List Iterator -Bottom to Top");

	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
	}
}
