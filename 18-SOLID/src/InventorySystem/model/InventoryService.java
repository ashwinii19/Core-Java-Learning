package InventorySystem.model;

public class InventoryService {	
	
	ReorderService reorderService;

    public InventoryService(ReorderService reorderService) {
        this.reorderService = reorderService;
    }

    public void removeStock(Product product, int amount) {
    	product.removeStock(amount);
        System.out.println("Current stock for " + product.getName() + ": " + product.getQuantity());

        if (product.getQuantity() <= product.getReorderThreshold()) {
            System.out.println("Reorder threshold reached for '" + product.getName() + "'. Triggering reorder...");
            reorderService.reorder(product);
        }
    }
}
