package pkg001;

import java.util.Scanner;

public class Calcu001 {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int x, y, z, r;
		System.out.println("Enter the value of x-");
		x=s.nextInt();
		System.out.println("Enter the value of y-");
		y=s.nextInt();
		
		z=x/y;
		System.out.println("Division of "+x+" by "+y+" is "+z+".");
		
		r=x%y;
		
		if(r>0){
		System.out.println("And the remainder of the division is "+r+".");
		}
	}
}
