package Assignment;

public class Q18 {

	public static void main(String[] args) {
		
		//W.A.J.P to check whether a given string starts with the contents of another string. 
		//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
		//with Red? False I3
		
		String str1="Red is favourite color";
		
		boolean parth2=str1.startsWith("Red");
		System.out.println(parth2);
		
		boolean parth3=str1.startsWith("orange");
		System.out.println(parth3);
	} 
}
