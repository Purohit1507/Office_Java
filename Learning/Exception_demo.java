package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_demo {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try
		{
		
		System.out.println("Enter value of A");
		int a=sc.nextInt();
		int b;
		do {
	    System.out.println("Enter value of B (it should be greater then zero)");
		b=sc.nextInt();
		} 
		while(b<=0);
		int c=a/b;
		{
		System.out.println("value of c is  " +c);
		}
		int [] parth= {1,2,3};
		{
		System.out.println(parth [3]);
		}
		}
		
		
//		catch(ArithmeticException e) {
//			System.out.println("Parth " +e);}
//			
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("utsav" +e);
//		}
//		catch(InputMismatchException e) {
//			System.out.println("hiren  "+e);
//	}
		catch(Exception parth) {
			System.out.println("exeption handled " +parth);
		}
		
		finally
		{
			System.out.println("anything ");
		}
		
	}}
		
	


