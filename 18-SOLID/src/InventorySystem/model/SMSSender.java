package InventorySystem.model;

public class SMSSender implements INotifier{

	@Override
	public void notify(String message) {
		System.out.println("[SMS] Notification sent: " + message);
	}

}
