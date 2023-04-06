package Assignment;

import java.util.Scanner;

//Write a Java program to print the ASCII value of a given character.

public class q9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
	
		char c=sc.next().charAt(0);
		int asciiValue=(int) c;
		
		
		System.out.println("Ascii value of "+c+ " is " + asciiValue);
		
	}
}
