package Assignment;

import java.util.Scanner;

public class Question__2 {
	
	

	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char n=sc.next().charAt(0)	;
	
		switch(n){
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': i++;
		}
		if(i==1)
			System.out.println("Entered character "+n+" is  Vowel");
			else 
				if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
				System.out.println("Entered character "+n+" is Consonent");
				else
				System.out.println("Not an alphabet");				{
				
		
	}
}
	}

