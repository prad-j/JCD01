package pkg001;

public class Bitwise001 {
	public static void main(String args[]){
		int a=25, b=20, c=a & b;
		
		System.out.println("Bitwise value of "+a+" is "+Integer.toBinaryString(a));
		System.out.println("Bitwise value of "+b+" is "+Integer.toBinaryString(b));
		System.out.println();
		System.out.println("Binary value of "+c+" is "+Integer.toBinaryString(c));
		System.out.println("c = a & b, so integer value of c is "+c);
		
		
	}
}
