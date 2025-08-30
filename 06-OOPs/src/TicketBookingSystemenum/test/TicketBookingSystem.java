package TicketBookingSystemenum.test;

import java.util.Scanner;

public class TicketBookingSystem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String name = scanner.nextLine();
		
		System.out.println("\n-------------------------------------------------\n");
		System.out.println("Select ticket type: ");
		System.out.println("\n1.Regular \n2.VIP \n3.PREMIUM");
		System.out.println("Enter choice(1-3): ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		TicketType type;
		switch(choice) {
		case 1:
			type = TicketType.Regular;
			break;
			
		case 2:
			type = TicketType.VIP;
			break;
			
		case 3:
			type = TicketType.PREMIUM;
			break;
			
		default:
			System.out.println("Invalid choice.");
			return;
		}
		
		Ticket ticket = new Ticket(name, type);
		
		
		System.out.println("\n-------------------------------------------------\n");
		System.out.println("Do you want to confirm booking? (yes/no): ");
		String decision = scanner.nextLine().toLowerCase();
		
		if(decision.equals("yes")) {
			ticket.confirm();
		}
		else if(decision.equals("no")) {
			ticket.cancel();
		}
		else {
			ticket.pending();
		}
		
		ticket.display();
		
		scanner.close();
	}
}

