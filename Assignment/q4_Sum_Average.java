package Assignment;

import java.util.Scanner;

public class q4_Sum_Average {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter digit 1");
//		int a=sc.nextInt();
//		System.out.println("enter digit 2");
//		int b=sc.nextInt();
//		System.out.println("enter digit 3");
//		int c=sc.nextInt();
//		System.out.println("enter digit 4");
//		int d=sc.nextInt();
//		System.out.println("enter digit 5");
//		int e=sc.nextInt();
//		
//		int sum=(a+b+c+d+e);
//		{
//			for (int i=0; i<=10; i++);
//			System.out.println(sum);
//		System.out.println(+sum/5);
		
		int sum=0;
		int count=5;
		
		System.out.println("enter " +count+ "numbers");
		for(int i=0; i<count; i++)
		{
			System.out.println("number" +(i+1)+ " :");
			int num=sc.nextInt();   // need to understand this in class
			sum +=num;               //// need to understand this in class
			
			
		}
		double avg=(double) sum/count;
		System.out.println("sum" +sum);
		System.out.println("average" + avg);
		
		}
	}


