import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking bookingObj=null;
		
		//Booking tokyoObj = new Booking(1001, "30/10/2022", (short)2, 25000f, "Economy", "Tokyo");
		//Booking singaporeObj = new Booking(1002, "28/9/2022", (short)2, 45000, "Business", "Singapore");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your destination: (Tokyo/Singapore):");
		String dest = sc.next();
		
		if(dest.equalsIgnoreCase("Tokyo"))
			bookingObj = new Booking(1001, "30/10/2022", (short)2, 25000f, "Economy", "Tokyo");
		else if(dest.equalsIgnoreCase("Singapore"))
			bookingObj=new Booking(1002, "28/9/2022", (short)2, 45000, "Business", "Singapore");
		else {
			System.out.println("Incorrect destination....!Try again...!");
			System.exit(0);
		}
		
		bookingObj.calTotalPrice();
		bookingObj.ticketConfirmation();
		
	}

}
