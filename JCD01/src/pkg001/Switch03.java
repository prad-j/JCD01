package pkg001;

public class Switch03 {
	public static void main(String args[]){
		String s="Samosa";
		
		switch (s){
		case "vadapav":
			System.out.println("Vadapav= 18");
			break;
		case "Pakoda":
			System.out.println("Pakoda= 25");
		    break;
		case "Samosa":
			System.out.println("Samosa= 16");
		    break;
		 default:
			 System.out.println("check entry");
		}
	}

}
