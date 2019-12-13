package pkg001;

import java.util.Scanner;

public class Scanner002 {
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.println("Enter the value of x-");
		x=s.nextInt();
		
		System.out.println("Enter the value of y-");
		y=s.nextInt();
		
		z=x+y;
		
		System.out.println("Sum of "+x+" and "+y+" is "+z+".");
		
	}
}
