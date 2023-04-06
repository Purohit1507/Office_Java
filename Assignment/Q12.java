package Assignment;

public class Q12 {
	
	//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 
	//and by both. 

	
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++)
			
			if((i % 3==0)&& (i % 5==0))
			{
					
					System.out.println(i +"division by both");
			}
			else if
			(i % 3==0)
			{
			System.out.println(i + "division of 3");
			}
			else if
			(i % 5==0)
			{
			System.out.println(i + "division of 5");
}
	}
}

