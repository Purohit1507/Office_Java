package Assignment;

public class Q17 {
	
	//W.A.J.P to check whether a given string ends with the contents of another string. 
	//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
	
	public static void main(String[] args) {
		
		String str1="Java exercises";
		String str2="Java exercise";
		
			boolean parth1=str1.endsWith("se");
			System.out.println(parth1);
			
			boolean parth2=str2.endsWith("se");
			System.out.println(parth2);
		
		
	}

}
