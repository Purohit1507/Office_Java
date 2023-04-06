package Assignment;

import java.util.Scanner;

/*Write a Java program that accepts an integer (n) and computes the value of 
n+nn+nnn. Input number: 5 
5 + 55 + 555
*/

public class q10 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int i=sc.nextInt();
		
		int ii=i*11;
		int iii=i*111;
		
		int result= i+ii+iii;
		System.out.println(+i+ "+"+ii+ "+"+iii+ "="+ result);
	}

}
