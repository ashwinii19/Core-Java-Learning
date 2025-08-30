package TicketBookingSystemenum.test;

public class Ticket {

	String name;
	int price;
	TicketType ticketType;
	BookingStatus status;
	
	public Ticket(String name, TicketType ticketType) {
		this.name = name;
		this.ticketType = ticketType;
		this.status = BookingStatus.PENDING;
		this.price = calculatePrice(ticketType);
	}

	private int calculatePrice(TicketType type) {
		if(type == TicketType.Regular) {
			return 100;
		}
		else if(type == TicketType.VIP) {
			return 200;
		}
		else {
			return 300;
		}
		
	}
	
	public void confirm() {
		status = BookingStatus.CONFIRMED;
	}
	
	public void cancel() {
		status = BookingStatus.CANCELLED;
	}
	
	public void pending() {
		status = BookingStatus.PENDING;
	}
	
	public void display() {
		System.out.println("\n--- Ticket Details ---");
		System.out.println("Customer Name: "+name);
		System.out.println("Ticket Type: "+ticketType);
		System.out.println("Price: RS."+price);
		System.out.println("Booking Status: "+status);
	}
	
}
