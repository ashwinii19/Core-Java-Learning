package InventorySystem.model;

public class EmailSender implements INotifier{

	@Override
	public void notify(String message) {
		System.out.println("[EMAIL] Notification sent: " + message);
	}

}
