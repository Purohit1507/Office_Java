package Assignment;


import java.util.ArrayList;
import java.util.List;

public class Q19 {
 public static void main(String[] args) {
	

		//W.A.J.P to find all interleaving of given strings. 
		//The given strings are: WX YZ 
		//The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ
		
	
		    String str1 = "WX";
		    String str2 = "YZ";
		    
		    List<String> interleavings = findInterleavings(str1, str2);
		    
		    System.out.println("The interleaved strings are:"); // need to understand this in class
		    for (String s : interleavings) {
		      System.out.println(s);
		    }
		  }
		  
		  public static List<String> findInterleavings(String str1, String str2) {
		    List<String> interleavings = new ArrayList<>();
		    
		    if (str1.length() == 0) {
		      interleavings.add(str2);
		      return interleavings;
		    }
		    
		    if (str2.length() == 0) {
		      interleavings.add(str1);
		      return interleavings;
		    }
		    
		    // Find all interleavings by recursively interleaving the two strings
		    char c1 = str1.charAt(0);
		    char c2 = str2.charAt(0);
		    
		    for (String s : findInterleavings(str1.substring(1), str2)) {
		      interleavings.add(c1 + s);
		    }
		    
		    for (String s : findInterleavings(str1, str2.substring(1))) {
		      interleavings.add(c2 + s);
		    }
		    
		    return interleavings;
		  }
		

	

}


