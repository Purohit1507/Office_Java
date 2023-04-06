package Assignment;


//Write a Java program to count the letters, spaces, numbers and other characters of 
//an input string


import java.util.Scanner;

public class q8 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String a=sc.nextLine();
		
		int number=0;
		int letters=0;
		int spaces=0;
		int othercharacter=0;
		
		for(int i=0; i<a.length(); i++) 
		{
			char p=a.charAt(i);
			
			if(Character.isDigit(p)) 
			{
				number++;
			
			}
			else if (Character.isLetter(p)) 
			{
				letters++;
			
			}
			else if (Character.isSpaceChar(p)) 
			{
				spaces++;
			
			}
			   else {
				othercharacter++;
		}
	}
	
			
		System.out.println("total letters are: "+letters);
		System.out.println("total numbers are: "+number);
		System.out.println("total spaces are: "+spaces);
		System.out.println("total other characters are :"+othercharacter);
		
		}}

