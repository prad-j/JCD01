package pkg001;

import java.util.Scanner;

public class Switch04 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the item");
		
		String sc=s.nextLine();
		
		switch (sc){
		case "samosa":
			System.out.println("Samosa = 16");
			break;
		case "vadapav":
			System.out.println("Vada Pav = 17");
			break;
		case "pakoda":
			System.out.println("Pakoda = 25");
			break;
		default:
			System.out.println("Item not on list.");
				
		}
	}

}
