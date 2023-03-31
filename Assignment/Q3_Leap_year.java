package Assignment;

import java.util.Scanner;

public class Q3_Leap_year {
	
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		
		if(year % 4==0)
		{
			System.out.println("Leap year");
		}
			else
			{
				System.out.println("it is not a leap year");
			}
		}
		 
		
	}


