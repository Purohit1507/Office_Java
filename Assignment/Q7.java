package Assignment;
import java.util.Scanner;


/*Write a Java program that reads a positive integer and count the number of digits the 
number. 
Input an integer number less than ten billion: 125463 
Number of digits in the number: 6
*/
public class Q7 {
public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input an integer number less than ten billion: ");
	        long number = sc.nextLong();

	        int count = 0;
	        while (number != 0) {
	            count++;
	            number =number/10;
	        }

	        System.out.println("Number of digits in the number: " + count);
	    }
	}

