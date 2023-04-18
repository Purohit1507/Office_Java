package Assignment;

public class Q16 {

	//W.A.J.P to compare a given string to the specified character sequence. Comparing 
	//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false 
	
	public static void main(String[] args) {
		
			    String str1 = "topsint.com";
			    String str2 = "topsint.com";
			    String str3 = "Topsint.com";
			    
			    
			    boolean parth=str1.contentEquals(str2);
			    System.out.println(parth);
			    
			   boolean parth2=str1.contentEquals(str3);
			   System.out.println(parth2);
	}
}

