package InventorySystem.model; //DIP

public class ReorderService {

	INotifier notifier;

	public ReorderService(INotifier notifier) {
		this.notifier = notifier;
	}

	public void reorder(Product product) {
		int reorderAmount = 20;
		
		product.addStock(reorderAmount);
		System.out.println("Reorder placed for " + reorderAmount + " units of '" + product.getName() + "'");
        notifier.notify("Low stock alert for '" + product.getName() + "'");
	}
}
