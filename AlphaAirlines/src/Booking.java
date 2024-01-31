
public class Booking {
	private int bookingID;			//instance var.
	private String departureDate;
	private short numberOfTickets;
	private float price;
	private String cabinType;
	private float totalPrice;
	private String destination;
	
	public Booking(int bookingID, String departureDate, short numberOfTickets, float price, String cabinType,
			String destination) {
		this.bookingID = bookingID;
		this.departureDate = departureDate;
		this.numberOfTickets = numberOfTickets;
		this.price = price;
		this.cabinType = cabinType;
		this.destination = destination;
	}
	
	public void calTotalPrice() {
		totalPrice = numberOfTickets*price;
	}
	
	public void ticketConfirmation() {
		System.out.println("Ticket Confirmation Details:-");
		System.out.println("Booking ID         :"+bookingID);
		System.out.println("Departure Date     :"+departureDate);
		System.out.println("No. of Tickets     :"+numberOfTickets);
		System.out.println("Price (per ticket) :"+price);
		System.out.println("Cabin Type         :"+cabinType);
		System.out.println("Destination        :"+destination);
		System.out.println("Total Price        :"+totalPrice);
	}
}
