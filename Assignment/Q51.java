package Assignment2;

import java.util.ArrayList;

// Write a Java program to update specific array element by given element.
public class Q51 {
	
		
		public static void main(String[] args) {
					
				
				ArrayList al=new ArrayList();
				al.add(1);
				al.add(789456);
				al.add(14.50);
				al.add("Tops");
				al.add('c');
				// al.add(1,"parth");
				
				
				System.out.println(al);
				
				int indexToUpdate = 2;
		        String newValue = "tops";
		        al.set(indexToUpdate, newValue);

		        
				System.out.println(al);
				

}
}
