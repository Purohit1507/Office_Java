package Learning;

import java.util.Scanner;

public class LadderIF {
	public static void main(String[] args) {
		
		
		int rollno;
		String name;
		int p,c,m,total;
		Double per;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter roll no :");
		rollno= sc.nextInt();
		System.out.print("Enter name :");
		name=sc.next();
		System.out.print("Enter Physics marks :");
		p=sc.nextInt();
		System.out.print("Enter Chemistry marks :");
		c=sc.nextInt();
		System.out.print("Enter maths marks :");
		m=sc.nextInt();
		total=p+c+m;
		System.out.println("total marks otained "+total+ "/300");
        per=(double)total/3;
        System.out.println(per);
        
        if(per>=75)
        {
        	System.out.println("Distinction");
        }
        else if(per>=60)
        {
        	System.out.println("First class");
        }
        else if(per>=50)
        {
        	System.out.println("second class");
        }
        else if (per>=40)
        {
            System.out.println("pass");       	
        }
        else 
        	System.out.println("fail");
        
	}

}
