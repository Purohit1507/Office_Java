package collection;

import java.util.HashSet;

/*HashSet : it internally implements the Set interface and extends the abstract class Set.
* 
* 			- it internally uses HashFunction Table.
* 			- it does not maintain the Insertion Order , because the Hash Function will 
* 			  decide ,which element to store at which position.
* 			- No Duplicate Values are allowed.
* 			- it stores Multiple values of Multiple types. 
* */
public class Hashset_Demo {
	
	public static void main(String[] args) {
		
		
		HashSet hs=new HashSet();
		hs.add(123);
		hs.add("parth");
		hs.add(true);
		hs.add('r');
		hs.add(123);
		
		
		System.out.println(hs);
		
		
		
	}

}
