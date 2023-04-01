package Assignment;

import java.util.Scanner;

public class Q1_greater_number {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st digit");
		int a=sc.nextInt();
		System.out.println("enter 2nd digit");
		int b=sc.nextInt();
		System.out.println("enter 3rd digit");
		int c=sc.nextInt();
		
		
		if(a>b) 
		{
			if(a>c)
			{
				System.out.println(+a+ " is greater");
			}
			else 
		
				{
				System.out.println(+c+ "is greater");
				}
		}else
			
		    if(b>c)
		    {
		    	System.out.println(+b+ "is greater");
		    }
		    	else
		    	{
		    		System.out.println(+c+ "is greater");
		    	}
		    }
	}


